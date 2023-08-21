package com.nt.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.demo.model.Customer;
import com.nt.demo.model.PhoneNumber;
import com.nt.demo.repository.ICustomerRepository;
import com.nt.demo.repository.IPhoneNumberRepository;
@Service
public class OneToManyAssociationServiceImpl implements IOnetoManyAssociationService{

	@Autowired
	private IPhoneNumberRepository phoneRepo;
	
	@Autowired
	private ICustomerRepository customerRepo;
	
	@Override
	public void saveDataUsingParent() {
	
		//create the Parent Object and Save Data 
		Customer cust = new Customer("Prashant", "Kedgaon", "prashantghodke@gmail.com");
		
	     // Create Child Object List and save the value
	    PhoneNumber ph1= new PhoneNumber(9527837455L, "Airtel", "Personal");
	    PhoneNumber ph2= new PhoneNumber(7420157817L, "Jio", "Office");
	    
	     Set<PhoneNumber> phone= new HashSet<PhoneNumber>();
	     phone.add(ph1);
	     phone.add(ph2);
	     
	     cust.setPhoneNumber(phone);
		
	     customerRepo.save(cust);
	     
	    System.out.println("Customer and His associated Phone Number saved to Database Tables");
	}

}
