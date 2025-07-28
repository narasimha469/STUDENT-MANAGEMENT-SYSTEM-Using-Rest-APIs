package com.projectSpringBoot.demo.employInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
//@Data
@Table(name = "EmployeInfo")
public class EmployInfo {

    @Id
    @GeneratedValue
    private Long employId;

    @Column
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 40, message = "Name should be between 3 and 40 characters")
    private String employName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Size(max = 30, message = "Email should be less than 30 characters")
    @Column
    private String employEmail;

    @Column(nullable = false, unique = true)
    @Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits")
    private String employPhoneNumber;


    @Column
    private String qualification;

    @Column
    private String companyName;

    @Column
    private double salary;

    @Column
    private String city;

	public Long getEmployId() {
		return employId;
	}

	public void setEmployId(Long employId) {
		this.employId = employId;
	}

	public String getEmployName() {
		return employName;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	public String getEmployEmail() {
		return employEmail;
	}

	public void setEmployEmail(String employEmail) {
		this.employEmail = employEmail;
	}

	public String getEmployPhoneNumber() {
		return employPhoneNumber;
	}

	public void setEmployPhoneNumber(String employPhoneNumber) {
		this.employPhoneNumber = employPhoneNumber;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
    
}

	
	

