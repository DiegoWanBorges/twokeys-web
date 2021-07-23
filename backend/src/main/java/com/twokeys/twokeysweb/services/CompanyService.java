package com.twokeys.twokeysweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.twokeys.twokeysweb.dto.CompanyDTO;
import com.twokeys.twokeysweb.entities.Company;
import com.twokeys.twokeysweb.repositories.CompanyRepository;
import com.twokeys.twokeysweb.services.exceptions.ResourceNotFoundException;



@Service
public class CompanyService {
	@Autowired
	private CompanyRepository repository;
	
	
	@Transactional(readOnly=true)
	public CompanyDTO findById(Long id){
		Optional<Company> obj = repository.findById(id);
		Company entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new CompanyDTO(entity);
	}
	
}
