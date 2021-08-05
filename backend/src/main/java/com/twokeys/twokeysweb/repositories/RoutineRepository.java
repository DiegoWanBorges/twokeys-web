package com.twokeys.twokeysweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.twokeysweb.entities.Routine;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {
		
}

