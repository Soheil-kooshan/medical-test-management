package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.PatientRequestDTO;
import com.soheil.test_management.dtos.request.TestValueRequestDTO;
import com.soheil.test_management.dtos.response.ReportResponseDTO;
import com.soheil.test_management.dtos.response.TestValueResponseDTO;
import com.soheil.test_management.entities.Report;
import com.soheil.test_management.entities.TestValue;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TestValueMapper {
    @Mapping(source = "test.id", target = "testId")
    @Mapping(source = "testParameter.id", target = "testParameterId")
    TestValueResponseDTO toResponseDTO(TestValue testValue);
    @Mapping(source = "testId" , target = "test.id")
    @Mapping(source = "testParameterId", target = "testParameter.id")
    TestValue toEntity(TestValueRequestDTO DTO);

    List<TestValueResponseDTO> toDTOList(List<TestValue> testValues);
    List<TestValue> toEntityList(List<TestValueRequestDTO> DTOs);
}
