package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.ExpectedRangeRequestDTO;
import com.soheil.test_management.dtos.response.ExpectedRangeResponseDTO;
import com.soheil.test_management.entities.ExpectedRange;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExpectedRangeMapper {

    ExpectedRangeResponseDTO toResponseDTO(ExpectedRange expectedRange);
    ExpectedRange toEntity(ExpectedRangeRequestDTO DTO);

    List<ExpectedRangeResponseDTO> toDTOList(List<ExpectedRange> expectedRanges);
    List<ExpectedRange> toEntityList(List<ExpectedRangeRequestDTO> DTOs);
}
