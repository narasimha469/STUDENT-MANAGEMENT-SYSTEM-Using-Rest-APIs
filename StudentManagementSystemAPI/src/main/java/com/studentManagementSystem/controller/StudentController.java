package com.studentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
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
import com.studentManagementSystem.exception.StudentNotFoundException;
import com.studentManagementSystem.model.StudentInfo;

@RestController
@RequestMapping("/API/studentsInformation")
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

	@GetMapping("/getStudentDetails/{student_Id}")
	public ResponseEntity<?> getStudentById(@PathVariable long student_Id) {
	    try {
	        StudentInfo student = studentService.getStudentDetailsById(student_Id);
	        return ResponseEntity.ok(student); 
	    } catch (StudentNotFoundException ex) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage()); 
	    }
	}



	@PutMapping("/updateStudents/{student_Id}")
	public ResponseEntity<?> updateStudents(@PathVariable Long student_Id, @RequestBody StudentInfo studentInfo) {
		try {
			StudentInfo updatedStudent = studentService.updateStudents(student_Id, studentInfo);
			return ResponseEntity.ok(updatedStudent);
		} catch (StudentNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

	@DeleteMapping("/deleteStudent")
	public ResponseEntity<?> deleteStudent(@RequestParam Long student_Id) {
		try {
			studentService.deleteStudentsById(student_Id);
			return ResponseEntity.ok("Student deleted successfully......");
		} catch (StudentNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

}
