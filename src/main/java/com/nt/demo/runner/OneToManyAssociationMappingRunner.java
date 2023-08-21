package com.nt.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.demo.service.IOnetoManyAssociationService;


@Component
public class OneToManyAssociationMappingRunner implements CommandLineRunner {

	@Autowired
	private IOnetoManyAssociationService service;
	
	@Override
	public void run(String... args) throws Exception {
	
		service.saveDataUsingParent();
		
		
	}

}
