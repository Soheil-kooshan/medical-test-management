package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepo extends JpaRepository<PasswordResetToken, Long> {
}
