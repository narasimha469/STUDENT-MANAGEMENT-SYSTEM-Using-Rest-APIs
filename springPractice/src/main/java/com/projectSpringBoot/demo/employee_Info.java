package com.projectSpringBoot.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employee_Info {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employee_Id;
	
	@Column
	private String name;
	 @Column
	 private String email;
	 @Column
	 private String phnno;
	 public long getEmployee_Id() {
		 return employee_Id;
	 }
	 public void setEmployee_Id(long employee_Id) {
		 this.employee_Id = employee_Id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public String getPhnno() {
		 return phnno;
	 }
	 public void setPhnno(String phnno) {
		 this.phnno = phnno;
	 }
	 
	 

}
