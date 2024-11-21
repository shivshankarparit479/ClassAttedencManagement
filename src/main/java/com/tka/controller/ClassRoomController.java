package com.tka.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tka.entity.Classrooms;
import com.tka.exception.InvalidClassException;
import com.tka.service.ClassRoomImpl;

@RestController("/classRoom")
public class ClassRoomController {

	@Autowired
	private ClassRoomImpl service;

	@PostMapping("/createClassRoom")
	public Classrooms createClassRoom(Classrooms room) {
		Classrooms rooms = service.addClassRoom(room);
		return rooms;
	}

	@GetMapping("/getAllClassrooms")
	public List<Classrooms> getAllClassrooms() {
		return service.getAllClassRooms();
	}

	@GetMapping("/getClassroomById/{id}")
	public Classrooms getClassroomById(@PathVariable Long id) throws InvalidClassException {
		return service.getClassById(id);
	}

	@PutMapping("/updateClassroom/{id}")
	public Classrooms updateClassroom(@PathVariable Long id,  @RequestBody Classrooms classroom) throws InvalidClassException {
		return service.updateClassRoomById(id, classroom);
	}

	@DeleteMapping("/deleteClassroom/{id}")
	public ResponseEntity<Void> deleteClassroom(@PathVariable Long id) {
		service.deleteClassRoomById(id);
		return ResponseEntity.noContent().build();
	}

}
