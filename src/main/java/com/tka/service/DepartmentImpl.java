package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.DepartmentService;

import com.tka.entity.Department;
import com.tka.exception.InvalidClassException;

import com.tka.repository.DepartmentReposatory;

@Service
public class DepartmentImpl implements DepartmentService{
	
	@Autowired
    private DepartmentReposatory repository;

    public List<Department> getAllDepartment() {
        return repository.findAll();
    }

    public Department getDepartmentById(Long id) throws InvalidClassException {
        return repository.findById(id).orElseThrow(() -> new InvalidClassException("Department not found"));
    }

    public Department createDepartment(Department depart) {
        return repository.save(depart);
    }

    public Department updateDepartment(Long id, Department depart) throws InvalidClassException {
    	Department existing = getDepartmentById(id);
        existing.setName(depart.getName());
        existing.setDescription(depart.getDescription());
        return repository.save(existing);
    }

    public void deleteDepartment(Long id) {
        repository.deleteById(id);
    }


}
