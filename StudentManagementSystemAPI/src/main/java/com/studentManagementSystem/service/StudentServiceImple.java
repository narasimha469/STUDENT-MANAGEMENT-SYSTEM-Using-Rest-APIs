package com.studentManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagementSystem.exception.StudentNotFoundException;
import com.studentManagementSystem.model.StudentInfo;
import com.studentManagementSystem.repository.StudentRepository;

@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentInfo createStudent(StudentInfo studentInfo) {

		return studentRepository.save(studentInfo);
	}

	@Override
	public List<StudentInfo> viewStudents() {

		return studentRepository.findAll();
	}

	@Override
	public StudentInfo getStudentDetailsById(Long student_Id) {
		StudentInfo student = studentRepository.findById(student_Id).orElse(null);

		if (student == null) {
			throw new StudentNotFoundException("Student not found with ID: " + student_Id);
		}

		return student;
	}

	@Override
	public StudentInfo updateStudents(Long studentId, StudentInfo studentInfo) {
		if (!studentRepository.existsById(studentId)) {
			throw new StudentNotFoundException("Student not found with ID: " + studentId);
		}
		studentInfo.setStudentId(studentId);
		return studentRepository.save(studentInfo);
	}

	@Override
	public void deleteStudentsById(Long student_Id) {
		if (!studentRepository.existsById(student_Id)) {
			throw new StudentNotFoundException("Student not found with ID: " + student_Id);
		}
		studentRepository.findById(student_Id);

	}

}
