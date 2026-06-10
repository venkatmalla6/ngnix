package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentDetailsService;
import com.example.demo.models.Studentdetails;

@RestController
@RequestMapping("/api/v1")
public class Studentdetailscontroller {

	@Autowired
	StudentDetailsService service;
	
	@PostMapping("/insert")
	public String addstudentdetails(@RequestBody Studentdetails std) {
		return service.addstudentdetails(std);
	}
}
