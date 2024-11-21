package com.tka.dao;

import java.util.List;

import com.tka.entity.Course;
import com.tka.exception.InvalidClassException;

public interface CourseService {
	
	 public Course createCourse(Course course);
	 public List<Course> getAllCourses();
	 public Course getCourseById(Long id) throws InvalidClassException;
	 public Course updateCourse(Long id, Course course) throws InvalidClassException;
	 public void deleteCourse(Long id);
}
