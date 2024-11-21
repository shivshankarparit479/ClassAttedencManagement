package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long Id;
	private String name;
	private String email;
	private String department;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Faculty(Long id, String name, String email, String department) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Faculty [Id=" + Id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
	}
	
	
	

}
