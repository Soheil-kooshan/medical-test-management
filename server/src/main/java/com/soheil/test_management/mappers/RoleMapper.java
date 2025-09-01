package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.PermissionRequestDTO;
import com.soheil.test_management.dtos.request.RoleRequestDTO;
import com.soheil.test_management.dtos.response.PermissionResponseDTO;
import com.soheil.test_management.dtos.response.RoleResponseDTO;
import com.soheil.test_management.entities.Permission;
import com.soheil.test_management.entities.Role;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    RoleResponseDTO toResponseDTO(Role role);
    Permission toEntity(RoleRequestDTO DTO);

    List<RoleResponseDTO> toDTOList(List<Role> Roles);
    List<Permission> toEntityList(List<RoleRequestDTO> DTOs);
}
