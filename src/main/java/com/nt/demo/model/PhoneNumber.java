package com.nt.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="Phone_Number_TAB")
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Pid;
	@Column(name="Phone_Number")
	@NonNull
	private Long PhoneNumber;
	@NonNull
	@Column(name="Service_Provider")
	private String serviceProvider;
	@NonNull	
	@Column(name="Phone_Type")
	private String type;
	
	@ManyToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Customer_ID",referencedColumnName = "Cust_ID")
	private Customer customer;
}
