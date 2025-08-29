package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Long> {
}
