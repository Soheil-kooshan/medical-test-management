package com.soheil.test_management.services;

import com.soheil.test_management.dtos.request.TestRequestDTO;
import com.soheil.test_management.dtos.response.TestResponseDTO;
import com.soheil.test_management.entities.Test;
import com.soheil.test_management.mappers.TestMapper;
import com.soheil.test_management.repositories.TestRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class TestService {

    private final TestRepo testRepo;

    private TestMapper testMapper;

    public List<TestResponseDTO> getAllTests(){
            List<Test> tests = testRepo.findAll();
            return testMapper.toResponseDtoList(tests);
    }


}
