package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.TestParameterRequestDTO;
import com.soheil.test_management.dtos.request.UserRequestDTO;
import com.soheil.test_management.dtos.response.TestParameterResponseDTO;
import com.soheil.test_management.dtos.response.TestResponseDTO;
import com.soheil.test_management.dtos.response.UserResponseDTO;
import com.soheil.test_management.entities.TestParameter;
import com.soheil.test_management.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface UserMapper {
    UserResponseDTO toResponseDTO(User user);
    User toEntity(UserRequestDTO DTO);

    List<UserResponseDTO> toDTOList(List<User> users);
    List<User> toEntityList(List<UserRequestDTO> DTOs);
}
