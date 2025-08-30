package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.TestFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestFileRepo extends JpaRepository<TestFile, Long> {
}
