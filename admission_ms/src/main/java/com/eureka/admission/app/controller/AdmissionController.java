package com.eureka.admission.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.admission.app.model.Student;
import com.eureka.admission.app.servicei.AdmissionServiceI;

@RestController
@RequestMapping("/adm")
public class AdmissionController {

	@Autowired
	AdmissionServiceI asi;
	
	@Value("${server.port}")
	String PortNumber;
	
	@PostMapping("/admission")
	public Student admissionInfo(@RequestBody Student s)
	{
		Student stu = asi.saveStudent(s);
		return stu;
	}
	
	@GetMapping("/admission")
	public String  getInfo()
	{
//		List<Student> list = asi.getStudents();  List<Student>
//		return list;
		return "Welcome to Admission Ms "+PortNumber;
	}
}
