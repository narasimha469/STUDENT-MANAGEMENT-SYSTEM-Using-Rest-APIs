package com.projectSpringBoot.demo.employInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRegistrationRepo extends JpaRepository<EmployInfo, Long>{

}
