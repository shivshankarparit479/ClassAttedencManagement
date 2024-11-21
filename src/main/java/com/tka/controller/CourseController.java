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

import com.tka.dao.CourseService;
import com.tka.entity.Course;
import com.tka.exception.InvalidClassException;
import com.tka.service.CourseImpl;

@RestController("/course")
public class CourseController {

	@Autowired
	private CourseImpl service;

	@GetMapping("/getAllCourse")
	public List<Course> getAllCourses() {
		return service.getAllCourses();
	}

	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable Long id) throws InvalidClassException {
		return service.getCourseById(id);
	}

	@PostMapping("/createCourse")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		return new ResponseEntity<>(service.createCourse(course), HttpStatus.CREATED);
	}

	@PutMapping("/updateCourse/{id}")
	public Course updateCourse(@PathVariable Long id, @RequestBody Course course) throws InvalidClassException {
		return service.updateCourse(id, course);
	}

	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
		service.deleteCourse(id);
		return ResponseEntity.noContent().build();
	}

}
