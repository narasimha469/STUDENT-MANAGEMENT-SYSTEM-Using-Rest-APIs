package com.projectSpringBoot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp/studentController")
public class RegistrationController {
	
@Autowired
StudentRegistrationService studentRegistrationService;
//field injection
//constructor injection
//setter injection
@GetMapping("helloStudent")
 public String helloStudent() {
	System.out.println("Hello Student ....");
	return "welcome Student";
}
@GetMapping("getStudent")
public List<StudentInfo> getStudentInfo(){
	StudentRegistrationService srs = new StudentRegistrationService();
	List<StudentInfo> stuInfo = srs.getStudentInfo();
	return stuInfo;
}

//@GetMapping("/getStudentById")
//public StudentInfo getStudentById(@RequestParam  long studentId) {
//	StudentRegistrationService srs = new StudentRegistrationService();
//   StudentInfo studentInfo= srs.getStudentById(studentId);
//	
//	return studentInfo;
//	
//}
@GetMapping("/getStudentById1/{studentId1}/{studentId2}")
public StudentInfo getStudentById1(@PathVariable  long studentId1, @PathVariable  long studentId2 ) {
	StudentRegistrationService srs = new StudentRegistrationService();
   StudentInfo studentInfo= srs.getStudentById(studentId1,studentId2);
	
	return studentInfo;
	
}

@PostMapping("/createStudent")
public StudentInfo createStudent(@RequestBody StudentInfo studentInfo){
	System.out.println("Student ID: " + studentInfo.getStudentId());
    System.out.println("Student Name: " + studentInfo.getStudentName());
    System.out.println("Email: " + studentInfo.getEmail());
    System.out.println("Phone: " + studentInfo.getPhone());
	return studentInfo;
}
}
