package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.PatientRequestDTO;
import com.soheil.test_management.dtos.request.TestFileRequestDTO;
import com.soheil.test_management.dtos.response.ReportResponseDTO;
import com.soheil.test_management.dtos.response.TestFileResponseDTO;
import com.soheil.test_management.dtos.response.TestResponseDTO;
import com.soheil.test_management.entities.Report;
import com.soheil.test_management.entities.TestFile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TestFileMapper {
    @Mapping(source = "test.id", target = "testId")
    TestFileResponseDTO toResponseDTO(TestFile testFile);
    @Mapping(source = "testId" , target = "test.id")
    Report toEntity(TestFileRequestDTO DTO);

    List<TestResponseDTO> toDTOList(List<TestFile> testFiles);
    List<TestFile> toEntityList(List<TestFileResponseDTO> DTOs);

}
