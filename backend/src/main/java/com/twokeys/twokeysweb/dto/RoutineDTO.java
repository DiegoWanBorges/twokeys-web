package com.twokeys.twokeysweb.dto;

import java.io.Serializable;

import com.twokeys.twokeysweb.entities.Routine;


public class RoutineDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String authority;
	private MenuDTO menu;
	
	public RoutineDTO() {
	}

	public RoutineDTO(Long id, String name, String authority, MenuDTO menu) {
		super();
		this.id = id;
		this.name = name;
		this.authority = authority;
		this.menu = menu;
	}
	
	public RoutineDTO(Routine entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.authority = entity.getAuthority();
		this.menu = new MenuDTO(entity.getMenu());
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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public MenuDTO getMenu() {
		return menu;
	}

	public void setMenu(MenuDTO menu) {
		this.menu = menu;
	}
	
}
