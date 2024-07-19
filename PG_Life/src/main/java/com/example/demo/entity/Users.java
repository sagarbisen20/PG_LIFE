package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String full_name;
	String phone;
	String email;
	String password;
	String college_name;
	String gender;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String full_name, String phone, String email, String password, String college_name,
			String gender) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.college_name = college_name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", full_name=" + full_name + ", phone=" + phone + ", email=" + email + ", password="
				+ password + ", college_name=" + college_name + ", gender=" + gender + "]";
	}

}
