package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.TestTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTemplateRepo extends JpaRepository<TestTemplate, Long> {
}
