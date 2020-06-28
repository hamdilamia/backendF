package com.backend.springboot.repository;

import java.util.Optional;

import com.backend.springboot.models.ERole;
import com.backend.springboot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
