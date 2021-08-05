package com.twokeys.twokeysweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.twokeysweb.entities.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
	
}