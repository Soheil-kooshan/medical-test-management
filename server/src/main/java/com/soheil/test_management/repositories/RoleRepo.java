package com.soheil.test_management.repositories;

import com.soheil.test_management.entities.Role;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaAttributeConverter<Role, Integer> {
}
