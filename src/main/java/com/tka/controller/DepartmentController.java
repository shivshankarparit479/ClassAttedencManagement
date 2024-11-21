package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tka.entity.Department;
import com.tka.exception.InvalidClassException;
import com.tka.service.DepartmentImpl;

@RestController("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentImpl service;

	@GetMapping("/getAllDepartment")
	public List<Department> getAllDepartment() {
		return service.getAllDepartment();
	}

	@GetMapping("/getDepartmentById/{id}")
	public Department getDepartmentById(@PathVariable Long id) throws InvalidClassException {
		return service.getDepartmentById(id);
	}

	@PostMapping("/createDepartment")
	public ResponseEntity<Department> createDepartment(@RequestBody Department depart) {
		return new ResponseEntity<>(service.createDepartment(depart), HttpStatus.CREATED);
	}

	@PutMapping("/updateDepartment/{id}")
	public Department updateDepartment(@PathVariable Long id, @RequestBody Department depart) throws InvalidClassException {
		return service.updateDepartment(id, depart);
	}

	@DeleteMapping("/deleteDepartment/{id}")
	public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
		service.deleteDepartment(id);
		return ResponseEntity.noContent().build();
	}

}
