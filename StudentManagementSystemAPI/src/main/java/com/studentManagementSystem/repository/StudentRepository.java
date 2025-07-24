package com.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentManagementSystem.model.StudentInfo;

public interface StudentRepository extends JpaRepository<StudentInfo, Long> {

}