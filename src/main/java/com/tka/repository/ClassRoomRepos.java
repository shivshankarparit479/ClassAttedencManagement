package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classrooms;

@Repository
public interface ClassRoomRepos extends JpaRepository<Classrooms, Long> {

}
