package com.tka.dao;
import java.util.List;

import com.tka.entity.Subject;
import com.tka.exception.InvalidClassException;

public interface SubjectService {
	
	public Subject addSubject(Subject subject);
	public Subject getSubjectById(Long id) throws InvalidClassException;
    public List<Subject> getAllSubjects();
	
	public Subject updateSubject(Long id, Subject subject) throws InvalidClassException;

	public void deleteSubject(Long id);

}
