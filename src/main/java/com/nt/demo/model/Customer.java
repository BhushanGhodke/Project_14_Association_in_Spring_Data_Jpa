package com.nt.demo.model;



import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name="Customer_TAB")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cust_ID")
	private Integer id;
	@Column(name="Cust_Name")
	@NonNull
	private String name;
	@Column(name="Cust_Addrs")
	@NonNull
	private String address;
	@Column(name="Cust_Email")
	@NonNull
	private String email;

	@OneToMany(targetEntity=PhoneNumber.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Customer_ID",referencedColumnName = "Cust_ID")
	private Set<PhoneNumber> phoneNumber;
}
