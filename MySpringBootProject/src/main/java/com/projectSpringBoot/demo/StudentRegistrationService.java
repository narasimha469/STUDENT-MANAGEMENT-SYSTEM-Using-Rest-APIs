package com.projectSpringBoot.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service("StudentRegistrationService") // it creates all class as bean .Automatically creates object.
public class StudentRegistrationService {
	@Autowired
	StudentRegistrationReport studentRegistrationReport;
	public List<StudentInfo> getStudentInfo() {
		List<StudentInfo> studentInfoList = new ArrayList<>();
		StudentInfo studentInfo1 = new StudentInfo();
		     studentInfo1.setStudentId(12L);
		     studentInfo1.setStudentName("narasimha");
		     studentInfo1.setEmail("narasimha@gmail.com");
		     StudentInfo studentInfo2 = new StudentInfo();
		     studentInfo2.setStudentId(123L);
		     studentInfo2.setStudentName("narasimhanaidu");
		     studentInfo2.setEmail("narasimha123@gmail.com");
		     studentInfoList.add(studentInfo1);
		     studentInfoList.add(studentInfo2);
		     return studentInfoList;
		
	}
	public  StudentInfo getStudentById( long studentId,long studentId2) {
		List<StudentInfo> studentInfoList =getStudentInfo();
		StudentInfo studentInfo = new StudentInfo();
		for(StudentInfo studentInfoObj:studentInfoList) {
			if(studentInfoObj.getStudentId().equals(studentId)) {
				studentInfo = studentInfoObj;
			   return studentInfo;
			}
	}
		return studentInfo;
	}
@PostMapping("/createCustomer")
public CustomerInfo createcustomer(@RequestBody CustomerInfo  customerInfo) {
//	studentRegistrationService.createcustomer(customerInfo);
	return customerInfo;
}

}
