package com.studentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.studentManagementSystem.service.StudentService;
import com.studentManagementSystem.model.StudentInfo;

@RestController
@RequestMapping("/studentsInformation")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/StudentRegistration")
	public StudentInfo studentRegistration(@RequestBody StudentInfo studentInfo) {
		return studentService.createStudent(studentInfo);
		
	}

	@GetMapping("/viewAllStudentsInfo")
	public List<StudentInfo> viewAllStudents() {
		return studentService.viewStudents();
	}

	@GetMapping("/getStudentDetails/{studentId}")
	public StudentInfo getStudentById(@PathVariable long studentId) {
	    return studentService.getStudentDetailsById(studentId);
	}



	@PutMapping("/updateStudents/{studentId}")
	public StudentInfo updateStudents(@PathVariable Long studentId, @RequestBody StudentInfo studentInfo) {
		return studentService.updateStudents(studentId, studentInfo);
		 
	}

	@DeleteMapping("/deleteStudent")
	public ResponseEntity<String> deleteStudent(@RequestParam Long studentId) {
		 studentService.deleteStudentsById(studentId);
		 return ResponseEntity.ok("Deleted successfully");
	}

}
