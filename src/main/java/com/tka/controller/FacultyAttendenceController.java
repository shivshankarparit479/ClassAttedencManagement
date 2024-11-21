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

import com.tka.entity.FacultyAttedence;
import com.tka.exception.InvalidClassException;
import com.tka.service.FacultyAttendenceImpl;

@RestController("/facultyAttendence")
public class FacultyAttendenceController {
	
	 @Autowired
	    private FacultyAttendenceImpl service;

	    @GetMapping("/getAllFacultyAttendances")
	    public List<FacultyAttedence> getAllFacultyAttendances() {
	        return service.getAllFacultyAttendence();
	    }

	    @GetMapping("/getFacultyAttendanceById/{id}")
	    public FacultyAttedence getFacultyAttendanceById(@PathVariable Long id) throws InvalidClassException {
	        return service.getFacultyAttendenceById(id);
	    }

	    @PostMapping("/createFacultyAttendance")
	    public ResponseEntity<FacultyAttedence> createFacultyAttendance(@RequestBody FacultyAttedence facultyAttendance) {
	        return new ResponseEntity<>(service.createFacultyAttendence(facultyAttendance), HttpStatus.CREATED);
	    }

	    @PutMapping("/updateFacultyAttendance/{id}")
	    public FacultyAttedence updateFacultyAttendance(@PathVariable Long id, @RequestBody FacultyAttedence facultyAttendance) throws InvalidClassException {
	        return service.updateFacultyAttendence(id, facultyAttendance);
	    }

	    @DeleteMapping("/deleteFacultyAttendance/{id}")
	    public ResponseEntity<Void> deleteFacultyAttendance(@PathVariable Long id) {
	        service.deleteFacultyAttendence(id);
	        return ResponseEntity.noContent().build();
	    }

}
