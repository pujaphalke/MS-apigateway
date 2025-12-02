package com.eureka.admission.app.servicei;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.admission.app.model.Student;
import com.eureka.admission.app.repository.AdmissionRepository;

@Service
public class AdmissionServiceImpl implements AdmissionServiceI{

	@Autowired
	AdmissionRepository ar;
	
	@Override
	public Student saveStudent(Student s) {
		
		return ar.save(s);
	}

	@Override
	public List<Student> getStudents() {
		return ar.findAll();
	}

}
