package com.twokeys.twokeysweb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twokeys.twokeysweb.dto.CompanyDTO;
import com.twokeys.twokeysweb.services.CompanyService;

@RestController
@RequestMapping(value="/companies")
public class CompanyResource {
	@Autowired
	CompanyService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<CompanyDTO> findById(@PathVariable Long id){
		return  ResponseEntity.ok().body(service.findById(id));
	}
	
}

