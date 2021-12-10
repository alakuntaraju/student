package com.cybage.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.sms.model.Student;
import com.cybage.sms.serviceImpl.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl studentservice;
	
	@PostMapping("/addstudent")
	public Student addstudent(@RequestBody Student student) {
		return studentservice.savStudent(student);
		
	}
	@PutMapping("/update")
	public Student editStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
		
	}

}
