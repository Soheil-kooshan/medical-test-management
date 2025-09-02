package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.TestRequestDTO;
import com.soheil.test_management.dtos.request.TestTemplateRequestDTO;
import com.soheil.test_management.dtos.response.TestTemplateResponseDTO;
import com.soheil.test_management.entities.TestTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TestTemplateMapper {
    TestTemplateResponseDTO toResponseDTO(TestTemplate testTemplate);
    TestTemplate toEntity(TestTemplateRequestDTO DTO);

    List<TestTemplateResponseDTO> toDTOList(List<TestTemplate> testTemplates);
    List<TestTemplate> toEntityList(List<TestRequestDTO> DTOs);
}
