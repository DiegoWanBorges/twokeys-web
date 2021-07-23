package com.twokeys.twokeysweb.dto;

import java.io.Serializable;

import com.twokeys.twokeysweb.entities.Company;

public class CompanyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String address;
	private String number;
	private String district;
	private String city;
	private Boolean enable;
	
	public CompanyDTO() {
	}

	public CompanyDTO(Long id, String name, String address, String number, String district, String city,
					  Boolean enable) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.district = district;
		this.city = city;
		this.enable = enable;
	}
	
	public CompanyDTO(Company entity) {
		id = entity.getId();
		name = entity.getName();
		address = entity.getAddress();
		number = entity.getNumber();
		district = entity.getDistrict();
		city = entity.getCity();
		enable = entity.getEnable();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	
	
	
}
