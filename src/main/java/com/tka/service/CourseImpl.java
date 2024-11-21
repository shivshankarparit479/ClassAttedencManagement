package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CourseService;
import com.tka.entity.Course;
import com.tka.exception.InvalidClassException;
import com.tka.repository.CourseRepository;

@Service
public class CourseImpl implements CourseService {
	
	 @Autowired
	    private CourseRepository repository;

	    public List<Course> getAllCourses() {
	        return repository.findAll();
	    }

	    public Course getCourseById(Long id) throws InvalidClassException {
	        return repository.findById(id).orElseThrow(() -> new InvalidClassException("Course not found"));
	    }

	    public Course createCourse(Course course) {
	        return repository.save(course);
	    }

	    public Course updateCourse(Long id, Course course) throws InvalidClassException {
	        Course existing = getCourseById(id);
	        existing.setName(course.getName());
	        return repository.save(existing);
	    }

	    public void deleteCourse(Long id) {
	        repository.deleteById(id);
	    }

}
