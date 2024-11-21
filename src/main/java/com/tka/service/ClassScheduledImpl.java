package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassScheduledServie;
import com.tka.entity.ClassScheduled;
import com.tka.exception.InvalidClassException;
import com.tka.repository.ClassScheduledRepos;

@Service
public class ClassScheduledImpl implements ClassScheduledServie{
	
	    @Autowired
	    private ClassScheduledRepos repository;

	    public List<ClassScheduled> getAllClassSchedules() {
	        return repository.findAll();
	    }

	    public ClassScheduled getClassScheduleById(Long id) throws InvalidClassException {
	        return repository.findById(id).orElseThrow(() -> new InvalidClassException("ClassSchedule not found"));
	    }

	    public ClassScheduled createClassSchedule(ClassScheduled classSchedule) {
	        return repository.save(classSchedule);
	    }

	    public ClassScheduled updateClassSchedule(Long id, ClassScheduled classSchedule) throws InvalidClassException {
	        ClassScheduled existing = getClassScheduleById(id);
	        existing.setClassroomId(classSchedule.getClassroomId());
	        existing.setSubjectId(classSchedule.getSubjectId());
	        existing.setDayOfWeek(classSchedule.getDayOfWeek());
	        existing.setStartTime(classSchedule.getStartTime());
	        existing.setEndTime(classSchedule.getEndTime());
	        return repository.save(existing);
	    }

	    public void deleteClassSchedule(Long id) {
	        repository.deleteById(id);
	    }
	}



