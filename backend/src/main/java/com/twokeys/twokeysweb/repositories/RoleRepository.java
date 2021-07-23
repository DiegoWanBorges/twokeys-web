package com.twokeys.twokeysweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.twokeysweb.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
		
}

