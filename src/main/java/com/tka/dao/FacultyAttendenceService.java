package com.tka.dao;

import java.util.List;
import com.tka.entity.FacultyAttedence;
import com.tka.exception.InvalidClassException;

public interface FacultyAttendenceService {
	
	 public List<FacultyAttedence> getAllFacultyAttendence();
	 public FacultyAttedence getFacultyAttendenceById(Long id) throws InvalidClassException;
	 public FacultyAttedence createFacultyAttendence(FacultyAttedence depart);
	 public FacultyAttedence updateFacultyAttendence(Long id, FacultyAttedence depart) throws InvalidClassException;
	 public void deleteFacultyAttendence(Long id);

}
