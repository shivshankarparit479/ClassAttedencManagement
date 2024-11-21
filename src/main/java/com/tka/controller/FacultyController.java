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
import com.tka.dao.FacultyService;
import com.tka.entity.Faculty;
import com.tka.exception.InvalidClassException;
import com.tka.service.FacultyImpl;

@RestController("/Faculty")
public class FacultyController {
	
	    @Autowired
	    private FacultyImpl service;

	    @GetMapping("/getAllFaculty")
	    public List<Faculty> getAllFaculty() {
	        return service.getAllFaculty();
	    }

	    @GetMapping("/getFacultyById/{id}")
	    public Faculty getFacultyById(@PathVariable Long id) throws InvalidClassException {
	        return service.getFacultyById(id);
	    }

	    @PostMapping("/createFaculty")
	    public ResponseEntity<Faculty> createFaculty(@RequestBody Faculty faculty) {
	        return new ResponseEntity<>(service.createFaculty(faculty), HttpStatus.CREATED);
	    }

	    @PutMapping("/updateFaculty/{id}")
	    public Faculty updateFaculty(@PathVariable Long id, @RequestBody Faculty faculty) throws InvalidClassException {
	        return service.updateFaculty(id, faculty);
	    }

	    @DeleteMapping("/deleteFaculty/{id}")
	    public ResponseEntity<Void> deleteFaculty(@PathVariable Long id) {
	        service.deleteFaculty(id);
	        return ResponseEntity.noContent().build();
	    }

}
