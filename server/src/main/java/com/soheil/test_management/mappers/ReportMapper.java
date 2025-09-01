package com.soheil.test_management.mappers;


import com.soheil.test_management.dtos.request.PatientRequestDTO;
import com.soheil.test_management.dtos.response.ReportResponseDTO;
import com.soheil.test_management.entities.Report;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ReportMapper {

    @Mapping(source = "test.id", target = "testId")
    @Mapping(source = "doctor.id", target = "doctorId")
    ReportResponseDTO toResponseDTO(Report report);
    @Mapping(source = "testId" , target = "test.id")
    @Mapping(source = "doctorId", target = "doctor.id")
    Report toEntity(PatientRequestDTO DTO);

    List<ReportResponseDTO> toDTOList(List<Report> reports);
    List<Report> toEntityList(List<ReportResponseDTO> DTOs);
}
