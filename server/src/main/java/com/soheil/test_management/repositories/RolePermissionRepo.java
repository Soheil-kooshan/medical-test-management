package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepo extends JpaRepository<RolePermission, Integer> {
}
