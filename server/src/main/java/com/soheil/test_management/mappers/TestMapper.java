package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.TestRequestDTO;
import com.soheil.test_management.dtos.response.TestResponseDTO;
import com.soheil.test_management.entities.Test;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TestMapper {
    @Mapping(source = "testTemplate.id", target = "testTemplateId")
    @Mapping(source = "testTemplate.name", target = "testTemplateName")
    TestResponseDTO toDTO(Test test);

    @Mapping(source = "patientId", target = "patient.id")
    @Mapping(source = "testTemplateId", target = "testTemplate.id")
    Test toEntity(TestRequestDTO DTO);

}
