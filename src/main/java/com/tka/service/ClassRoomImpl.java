package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassRoomService;
import com.tka.entity.Classrooms;
import com.tka.exception.InvalidClassException;
import com.tka.repository.ClassRoomRepos;

@Service
public class ClassRoomImpl implements ClassRoomService {
	
	@Autowired
	private ClassRoomRepos repos;

	@Override
	public Classrooms addClassRoom(Classrooms room) {
		Classrooms rooms= repos.save(room);
		return rooms;
		
	}

	@Override
	public Classrooms getClassById(Long id) throws InvalidClassException {
		// TODO Auto-generated method stub
		  return repos.findById(id).orElseThrow(() -> new InvalidClassException("Classroom not found"));
	}

	@Override
	public List<Classrooms> getAllClassRooms() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public Classrooms updateClassRoomById(Long id, Classrooms classroom) throws InvalidClassException {
		// TODO Auto-generated method stub
		 Classrooms existing = getClassById(id);
	        existing.setName(classroom.getName());
	        existing.setCapacity(classroom.getCapacity());
	        return repos.save(existing);
	}

	@Override
	public void deleteClassRoomById(Long id) {
		// TODO Auto-generated method stub
		repos.deleteById(id);
	}
	

}
