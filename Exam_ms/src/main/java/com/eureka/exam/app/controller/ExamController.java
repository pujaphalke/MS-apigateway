package com.eureka.exam.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eureka.exam.app.model.Student;

@RestController
@RequestMapping("/em")
public class ExamController {

	@Autowired
	RestTemplate rt;
	
	@Value("${server.port}")
	String PortNumber;
	
	@GetMapping("/exam")
	public String getExamInfo()
	{
//		List<Student> l=rt.getForObject("http://localhost:1111/admission", List.class); List<Student>
//		return l;
		return "Welcome Exam Ms "+PortNumber;
	}
}
