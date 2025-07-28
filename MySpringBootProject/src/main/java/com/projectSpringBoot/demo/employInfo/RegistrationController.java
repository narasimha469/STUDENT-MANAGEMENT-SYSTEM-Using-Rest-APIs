package com.projectSpringBoot.demo.employInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;
@RestController
@RequestMapping("/myapp/EmployeeController")
public class RegistrationController {
  @Autowired
  EmployRegistrationService  employRegistrationService;
  @PostMapping("/createEmployee")
  public EmployInfo createEmployee(@Valid @RequestBody EmployInfo employInfo) {
	  return  employRegistrationService.saveEmployInfo(employInfo);
  }
 @GetMapping("/getEmployee/{employId}")
 public EmployInfo getEmployee(@PathVariable long employId) {
	 return employRegistrationService.getEmployId(employId);
 }
 // finding multiple employees.
 @GetMapping("/getEmployees")
 public List<EmployInfo>getEmployees(@RequestParam List<Long>employIds){
	 return employRegistrationService.getEmployeesByIds(employIds);
 }
 @GetMapping("/getAllEmployees")
 public List<EmployInfo>getAllEmployees(){
	 return employRegistrationService.getAllEmployees();
 }

}
