package com.twokeys.twokeysweb.services;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.twokeys.twokeysweb.dto.RoutineDTO;
import com.twokeys.twokeysweb.entities.Routine;
import com.twokeys.twokeysweb.repositories.RoutineRepository;

@Service
public class RoutineService {
	@Autowired
	private RoutineRepository repository;
	
	@Transactional(readOnly=true)
	public List<RoutineDTO> findAll(){
		List<Routine> list =  repository.findAll();
		return list.stream().map(x -> new RoutineDTO(x)).collect(Collectors.toList());
	}
}
