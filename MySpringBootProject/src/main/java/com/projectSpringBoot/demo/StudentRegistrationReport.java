package com.projectSpringBoot.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationReport extends JpaRepository<StudentInfo, Long> {

}
