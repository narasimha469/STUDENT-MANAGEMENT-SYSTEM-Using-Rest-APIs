package com.studentManagementSystem.service;

import java.util.List;

import com.studentManagementSystem.model.StudentInfo;

public interface StudentService {
	StudentInfo createStudent(StudentInfo studentInfo);

	List<StudentInfo> viewStudents();

	StudentInfo getStudentDetailsById(Long student_Id);

	StudentInfo updateStudents(Long student_Id, StudentInfo studentInfo);

	void deleteStudentsById(Long student_Id);


}