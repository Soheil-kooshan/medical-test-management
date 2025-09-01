package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.PatientRequestDTO;
import com.soheil.test_management.dtos.request.TestParameterRequestDTO;
import com.soheil.test_management.dtos.request.TestRequestDTO;
import com.soheil.test_management.dtos.response.ReportResponseDTO;
import com.soheil.test_management.dtos.response.TestParameterResponseDTO;
import com.soheil.test_management.dtos.response.TestResponseDTO;
import com.soheil.test_management.entities.Report;
import com.soheil.test_management.entities.TestParameter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TestParameterMapper {

    TestParameterResponseDTO toResponseDTO(TestParameter testParameter);
    @Mapping(source = "testTemplateId", target = "template.id")
    TestParameter toEntity(TestParameterRequestDTO DTO);

    List<TestResponseDTO> toDTOList(List<TestParameter> testParameters);
    List<TestParameter> toEntityList(List<TestResponseDTO> DTOs);
}
