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
import com.tka.entity.Subject;
import com.tka.exception.InvalidClassException;
import com.tka.service.SubjectImpl;

@RestController("/Subject")
public class SubjectController {
	
	  @Autowired
	    private SubjectImpl service;

	    @GetMapping("/getAllSubject")
	    public List<Subject> getAllSubject() {
	        return service.getAllSubjects();
	    }

	    @GetMapping("/getSubjectById/{id}")
	    public Subject getSubjectById(@PathVariable Long id) throws InvalidClassException {
	        return service.getSubjectById(id);
	    }

	    @PostMapping("/createSubject")
	    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
	        return new ResponseEntity<>(service.addSubject(subject), HttpStatus.CREATED);
	    }

	    @PutMapping("/updateSubject/{id}")
	    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subject) throws InvalidClassException {
	        return service.updateSubject(id, subject);
	    }

	    @DeleteMapping("/deleteSubject/{id}")
	    public ResponseEntity<Void> deleteSubject(@PathVariable Long id) {
	        service.deleteSubject(id);
	        return ResponseEntity.noContent().build();
	    }

}
