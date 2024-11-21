package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.ClassScheduled;

@Repository
public interface ClassScheduledRepos extends JpaRepository<ClassScheduled, Long>{

}
