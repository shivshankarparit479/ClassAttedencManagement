package com.tka.dao;

import java.util.List;

import com.tka.entity.ClassScheduled;
import com.tka.exception.InvalidClassException;

public interface ClassScheduledServie {

	public List<ClassScheduled> getAllClassSchedules();

	public ClassScheduled getClassScheduleById(Long id) throws InvalidClassException;

	public ClassScheduled createClassSchedule(ClassScheduled classSchedule);

	public ClassScheduled updateClassSchedule(Long id, ClassScheduled classSchedule) throws InvalidClassException;

	public void deleteClassSchedule(Long id);

}
