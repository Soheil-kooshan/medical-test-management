package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.PatientRequestDTO;
import com.soheil.test_management.dtos.response.PatientResponseDTO;
import com.soheil.test_management.entities.Patient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {

    PatientResponseDTO toResponseDTO(Patient patient);
    Patient toEntity(PatientRequestDTO DTO);

    List<PatientResponseDTO> toDTOList(List<Patient> patients);
    List<Patient> toEntityList(List<PatientRequestDTO> DTOs);
}
