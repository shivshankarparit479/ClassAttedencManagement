package com.tka.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.FacultyService;
import com.tka.entity.Faculty;
import com.tka.exception.InvalidClassException;
import com.tka.repository.FacultyRepository;

@Service
public class FacultyImpl implements FacultyService {
	
	    @Autowired
	    private FacultyRepository repository;

	    public List<Faculty> getAllFaculty() {
	        return repository.findAll();
	    }

	    public Faculty getFacultyById(Long id) throws InvalidClassException {
	        return repository.findById(id).orElseThrow(() -> new InvalidClassException("Faculty not found"));
	    }

	    public Faculty createFaculty(Faculty faculty) {
	        return repository.save(faculty);
	    }

	    public Faculty updateFaculty(Long id, Faculty faculty) throws InvalidClassException {
	    	Faculty existing = getFacultyById(id);
	        existing.setId(faculty.getId());
	        existing.setDepartment(faculty.getDepartment());
	        existing.setEmail(faculty.getEmail());
	        existing.setName(faculty.getName());
	        return repository.save(existing);
	    }

	    public void deleteFaculty(Long id) {
	        repository.deleteById(id);
	    }

}
