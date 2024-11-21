package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tka.entity.FacultyAttedence;

@Repository
public interface FacultyAttendanceRepository extends JpaRepository<FacultyAttedence, Long> {

}
