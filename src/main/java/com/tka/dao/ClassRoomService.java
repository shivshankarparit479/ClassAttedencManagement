package com.tka.dao;

import java.util.List;

import com.tka.entity.Classrooms;
import com.tka.exception.InvalidClassException;

public interface ClassRoomService {
	
	public Classrooms addClassRoom(Classrooms room);
	public Classrooms getClassById(Long id) throws InvalidClassException;
	public List<Classrooms> getAllClassRooms();
	public void deleteClassRoomById(Long id);
	public Classrooms updateClassRoomById(Long id, Classrooms classroom) throws InvalidClassException;

}
