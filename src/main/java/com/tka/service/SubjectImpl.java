package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.SubjectService;
import com.tka.entity.Faculty;
import com.tka.entity.Subject;
import com.tka.exception.InvalidClassException;
import com.tka.repository.FacultyRepository;
import com.tka.repository.SubjectRepository;

@Service
public class SubjectImpl implements SubjectService {
	
	@Autowired
    private SubjectRepository repository;

	@Override
	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
		return repository.save(subject);
	}

	@Override
	public Subject getSubjectById(Long id) throws InvalidClassException {
		// TODO Auto-generated method stub
		 return repository.findById(id).orElseThrow(() -> new InvalidClassException("Subject not found"));
	}

	

	@Override
	public Subject updateSubject(Long id, Subject subject) throws InvalidClassException {
		// TODO Auto-generated method stub
		Subject existing = getSubjectById(id);
        existing.setId(subject.getId());
        existing.setDescription(subject.getDescription());
        existing.setName(subject.getName());
        return repository.save(existing);
		
	}

	@Override
	public void deleteSubject(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
