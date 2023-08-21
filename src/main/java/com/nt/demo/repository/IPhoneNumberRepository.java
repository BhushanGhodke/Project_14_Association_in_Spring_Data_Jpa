package com.nt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.demo.model.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {

}
