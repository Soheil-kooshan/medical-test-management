package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<Permission, Integer> {
}
