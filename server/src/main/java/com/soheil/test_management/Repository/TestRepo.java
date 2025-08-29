package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
}
