package com.projectSpringBoot.demo.employInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployRegistrationService implements ServiceInterface{
@Autowired
EmployRegistrationRepo   employRegistrationRepo;
  //saving details.
@Override
public EmployInfo saveEmployInfo(EmployInfo employInfo) {

	return employRegistrationRepo.save(employInfo);
	
}
//searching details by primary key.
@Override
public EmployInfo getEmployId(long employId) {
	return employRegistrationRepo.findById(employId)
			.orElseThrow(()-> new RuntimeException("No employee found with ID: " + employId));
	
}
//searching multiple details by using list.
@Override
public List<EmployInfo> getEmployeesByIds(List<Long> employIds) {
    return employRegistrationRepo.findAllById(employIds);
}
// finding all employee details.
@Override
public List<EmployInfo>getAllEmployees(){
	return  employRegistrationRepo.findAll();
}

}
