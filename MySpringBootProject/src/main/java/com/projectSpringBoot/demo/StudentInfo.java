package com.projectSpringBoot.demo;

public class StudentInfo {
	private Long studentId;
	private String studentName;
	private String email;
	private long phone;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	

}
