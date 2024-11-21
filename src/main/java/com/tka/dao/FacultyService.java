package com.tka.dao;

import java.util.List;
import com.tka.entity.Faculty;
import com.tka.exception.InvalidClassException;

public interface FacultyService {

	public List<Faculty> getAllFaculty();

	public Faculty getFacultyById(Long id) throws InvalidClassException;

	public Faculty createFaculty(Faculty faculty);

	public Faculty updateFaculty(Long id, Faculty faculty) throws InvalidClassException;

	public void deleteFaculty(Long id);

}
