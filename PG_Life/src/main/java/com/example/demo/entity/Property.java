package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String name;
	public String address;
	public String gender;
	public String rent;
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(Long id, String name, String address, String gender, String rent) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.rent = rent;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", rent="
				+ rent + "]";
	}

}
