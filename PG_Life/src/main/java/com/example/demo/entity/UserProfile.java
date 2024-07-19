package com.example.demo.entity;

public class UserProfile {
	public Long id;
	public String full_name;
	public String email;
	public String phone;
	public String college;
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfile(Long id, String full_name, String email, String phone, String college) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.phone = phone;
		this.college = college;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return full_name;
	}
	public void setName(String name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", name=" + full_name + ", email=" + email + ", phone=" + phone + ", college="
				+ college + "]";
	}


}
