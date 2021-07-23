package com.twokeys.twokeysweb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.twokeys.twokeysweb.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotBlank(message = "Campo nome obrigatorio")	
	private String name;
	
	
	@Email(message = "Formato de e-mail invalido")
	private String email;
	
	private CompanyDTO company;
	
	private List<RoleDTO> roles = new ArrayList<>();
	
	public UserDTO() {
		
	}
		
	public UserDTO(Long id, @NotBlank(message = "Campo nome obrigatorio") String name,
				   String email,CompanyDTO company, List<RoleDTO> roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.company = company;
		this.roles = roles;
		
	}


	public UserDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.company = new CompanyDTO(entity.getCompany());
		entity.getRoles().forEach(rol -> this.roles.add(new RoleDTO(rol)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public List<RoleDTO> getRoles() {
		return roles;
	}
		
}
