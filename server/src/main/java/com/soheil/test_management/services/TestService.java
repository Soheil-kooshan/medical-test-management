package com.soheil.test_management.services;

import com.soheil.test_management.dtos.request.TestRequestDTO;
import com.soheil.test_management.entities.Test;
import com.soheil.test_management.repositories.TestRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class TestService {

    private final TestRepo testRepo;

    public List<Test> getAllTests(){

    }


}
