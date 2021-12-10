package com.cybage.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.sms.model.Student;
import com.cybage.sms.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repository;
	

	@Override
	public Student savStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student existingstudent=repository.findById(student.getStudentid()).orElse(null);
				existingstudent.setStudentname(student.getStudentname());
				existingstudent.setStudentbloodgroup(student.getStudentbloodgroup());
				existingstudent.setScorepoints(student.getScorepoints());
				existingstudent.setStudentaddress(student.getStudentaddress());
		return repository.save(existingstudent);
	}


}
