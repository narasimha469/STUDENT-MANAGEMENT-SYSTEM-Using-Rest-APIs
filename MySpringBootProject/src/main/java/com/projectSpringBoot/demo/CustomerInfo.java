package com.projectSpringBoot.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="CustomerInfo") create user defined name.
public class CustomerInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long customerId;
	@Column(nullable=false)
   private String customerName;
}
