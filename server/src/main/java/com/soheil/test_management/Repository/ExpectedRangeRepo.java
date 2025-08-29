package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.ExpectedRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpectedRangeRepo extends JpaRepository<ExpectedRange, Long> {
}
