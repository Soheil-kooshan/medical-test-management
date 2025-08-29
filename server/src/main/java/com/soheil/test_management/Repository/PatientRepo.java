package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
}
