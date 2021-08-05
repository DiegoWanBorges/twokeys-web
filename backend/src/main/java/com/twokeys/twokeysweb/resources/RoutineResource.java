package com.twokeys.twokeysweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twokeys.twokeysweb.dto.RoutineDTO;
import com.twokeys.twokeysweb.services.RoutineService;

@RestController
@RequestMapping(value="/routines")
public class RoutineResource {
	
	@Autowired
	private  RoutineService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<RoutineDTO>> findByName(){
	
		return ResponseEntity.ok().body(service.findAll());
	}
	
	
}
