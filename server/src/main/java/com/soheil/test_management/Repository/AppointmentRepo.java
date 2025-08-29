package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}
