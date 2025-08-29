package com.soheil.test_management.Repository;

import com.soheil.test_management.Entity.Role;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaAttributeConverter<Role, Integer> {
}
