package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Department;

public interface DepartmentReposatory extends JpaRepository<Department, Long> {

}
