package com.studentManagementSystem.service;

import java.util.List;
import java.util.Optional;

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
		Optional<StudentInfo> students = studentRepository.findById(student_Id);
		if(students.isPresent()) {
			return students.get();
		}else {
	        throw new StudentNotFoundException("Student not found with this Id");
		}
	}

	@Override
	public StudentInfo updateStudents(Long studentId, StudentInfo studentInfo) {
		Optional<StudentInfo> students = studentRepository.findById(studentId);
		if(students.isPresent()) {
			studentInfo.setStudentId(studentId);
			return studentRepository.save(studentInfo);
		}
		else {
		 throw new StudentNotFoundException("Student not found with this Id");
		}
	}

	@Override
	public void deleteStudentsById(Long studentId) {
	    Optional<StudentInfo> students = studentRepository.findById(studentId);
	    if (students.isPresent()) {
	        studentRepository.deleteById(studentId);
	    } else {
	        throw new StudentNotFoundException("Student not found with this Id");
	    }
	}

		

}
