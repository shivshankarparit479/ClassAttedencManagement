package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.dao.ClassScheduledServie;
import com.tka.entity.ClassScheduled;
import com.tka.exception.InvalidClassException;

@RestController("/classScheduled")
public class ClassScheduledController {
	
	  @Autowired
	    private ClassScheduledServie service;

	    @GetMapping("/getAllClassSchedules")
	    public List<ClassScheduled> getAllClassSchedules() {
	        return service.getAllClassSchedules();
	    }

	    @GetMapping("/getClassScheduleById/{id}")
	    public ClassScheduled getClassScheduleById(@PathVariable Long id) throws InvalidClassException {
	        return service.getClassScheduleById(id);
	    }

	    @PostMapping("/createClassSchedule")
	    public ResponseEntity<ClassScheduled> createClassSchedule(@RequestBody ClassScheduled classSchedule) {
	        return new ResponseEntity<>(service.createClassSchedule(classSchedule), HttpStatus.CREATED);
	    }

	    @PutMapping("/updateClassSchedule/{id}")
	    public ClassScheduled updateClassSchedule(@PathVariable Long id, @RequestBody ClassScheduled classSchedule) throws InvalidClassException {
	        return service.updateClassSchedule(id, classSchedule);
	    }

	    @DeleteMapping("/deleteClassSchedule/{id}")
	    public ResponseEntity<Void> deleteClassSchedule(@PathVariable Long id) {
	        service.deleteClassSchedule(id);
	        return ResponseEntity.noContent().build();
	    }

}
