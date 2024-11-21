package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.FacultyAttendenceService;
import com.tka.dao.FacultyService;
import com.tka.entity.FacultyAttedence;
import com.tka.exception.InvalidClassException;
import com.tka.repository.FacultyAttendanceRepository;

@Service
public class FacultyAttendenceImpl implements FacultyAttendenceService {
	
	 @Autowired
	    private FacultyAttendanceRepository repository;

	    public List<FacultyAttedence> getAllFacultyAttendence() {
	        return repository.findAll();
	    }

	    public FacultyAttedence getFacultyAttendenceById(Long id) throws InvalidClassException {
	        return repository.findById(id).orElseThrow(() -> new InvalidClassException("FacultyAttendance not found"));
	    }

	    public FacultyAttedence createFacultyAttendence(FacultyAttedence FacultyAttedence) {
	        return repository.save(FacultyAttedence);
	    }

	    public FacultyAttedence updateFacultyAttendence(Long id, FacultyAttedence FacultyAttedence) throws InvalidClassException {
	    	FacultyAttedence existing = getFacultyAttendenceById(id);
	        existing.setFacultyId(FacultyAttedence.getId());
	        existing.setClassScheduleId(FacultyAttedence.getClassScheduleId());
	        existing.setDate(FacultyAttedence.getDate());
	        existing.setStatus(FacultyAttedence.getStatus());
	        return repository.save(existing);
	    }

	    public void deleteFacultyAttendence(Long id) {
	        repository.deleteById(id);
	    }

}
