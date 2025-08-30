package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.TestParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestParameterRepo extends JpaRepository<TestParameter, Long> {
}
