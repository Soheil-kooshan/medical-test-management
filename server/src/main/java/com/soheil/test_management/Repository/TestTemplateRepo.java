package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.TestTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTemplateRepo extends JpaRepository<TestTemplate, Long> {
}
