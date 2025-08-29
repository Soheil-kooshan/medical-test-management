package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepo extends JpaRepository<RolePermission, Integer> {
}
