package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.TestValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestValueRepo extends JpaRepository<TestValue, Long> {
}
