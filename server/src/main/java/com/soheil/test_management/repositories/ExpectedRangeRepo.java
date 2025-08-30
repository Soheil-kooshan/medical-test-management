package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.ExpectedRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpectedRangeRepo extends JpaRepository<ExpectedRange, Long> {
}
