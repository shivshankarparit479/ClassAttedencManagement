package com.tka.dao;

import java.util.List;

import com.tka.entity.Department;
import com.tka.exception.InvalidClassException;

public interface DepartmentService {
	 public List<Department> getAllDepartment();
	 public Department getDepartmentById(Long id) throws InvalidClassException;
	 public Department createDepartment(Department depart);
	 public Department updateDepartment(Long id, Department depart) throws InvalidClassException;
	 public void deleteDepartment(Long id);

}
