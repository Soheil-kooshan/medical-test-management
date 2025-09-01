package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.PatientRequestDTO;
import com.soheil.test_management.dtos.request.PermissionRequestDTO;
import com.soheil.test_management.dtos.response.PermissionResponseDTO;
import com.soheil.test_management.entities.Permission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {
    PermissionResponseDTO toResponseDTO(Permission permission);
    Permission toEntity(PermissionRequestDTO DTO);

    List<PermissionResponseDTO> toDTOList(List<Permission> permission);
    List<Permission> toEntityList(List<PermissionRequestDTO> DTOs);
}
