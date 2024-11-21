package com.tka.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FacultyAttedence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long facultyId;
	private Long classScheduleId;
	private LocalDate date;
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	public Long getClassScheduleId() {
		return classScheduleId;
	}
	public void setClassScheduleId(Long classScheduleId) {
		this.classScheduleId = classScheduleId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public FacultyAttedence(Long id, Long facultyId, Long classScheduleId, LocalDate date, String status) {
		super();
		this.id = id;
		this.facultyId = facultyId;
		this.classScheduleId = classScheduleId;
		this.date = date;
		this.status = status;
	}
	public FacultyAttedence() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FacultyAttedence [id=" + id + ", facultyId=" + facultyId + ", classScheduleId=" + classScheduleId
				+ ", date=" + date + ", status=" + status + "]";
	}
	
	

}
