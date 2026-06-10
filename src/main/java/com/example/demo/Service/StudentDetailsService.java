package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentdetailsRepository;
import com.example.demo.models.Studentdetails;

@Service
public class StudentDetailsService {

	@Autowired
	StudentdetailsRepository repo;
	
	public String addstudentdetails(Studentdetails std) {
		 repo.save(std);
		 return "add successfully";
	}
}
