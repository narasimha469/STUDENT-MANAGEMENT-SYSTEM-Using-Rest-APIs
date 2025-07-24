package com.studentManagementSystem.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "StudentInformation")
public class StudentInfo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;

	@Column
	@NotNull(message = "student name is required")
	@Size(min = 2, max = 30, message = "firts_Name must be between 2 and 30 characters")
	private String firstName;

	@Column
	@NotNull(message = "student name is required")
	@Size(min = 2, max = 30, message = "last_Name must be between 2 and 30 characters")
	private String lastName;

	@Column(unique = true)
	@Email(message = "email must be valid")
	@NotNull(message = "student email is required")
	private String email;

	@Column(unique = true)
	@NotNull(message = "student mobile number is required")
	@Pattern(regexp = "^(\\+?\\d{1,3}[- ]?)?\\d{10}$", message = "Invalid phone number format")
	private String phoneNumber;

	@Column
	@NotNull
	private String gender;

	@Column
	@NotNull
	private Date dateOfBirth;

	@Column(unique = true)
	@NotNull(message = "rollnumber should be unique")
	private String rollNumber;

	@Column
	@NotNull
	private String department;

	@Column
	@NotNull
	private String course;

	@Column
	@NotNull
	private String admissionYear;

	@Column
	@NotNull
	private String passedoutYear;

	@Column
	@NotNull
	private double cgpa;

	@Column
	@NotNull
	private int backlogs;

	@Column
	@NotNull
	private String age;

	@Column
	@NotNull
	private String collegeName;

	@Column
	@NotNull
	private String address;

	@Column
	@NotNull
	private String studentStatus;

}
