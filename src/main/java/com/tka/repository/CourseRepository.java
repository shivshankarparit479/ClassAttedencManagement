package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
