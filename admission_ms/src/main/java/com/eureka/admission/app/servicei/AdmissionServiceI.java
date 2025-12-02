package com.eureka.admission.app.servicei;

import java.util.List;

import com.eureka.admission.app.model.Student;

public interface AdmissionServiceI {

	Student saveStudent(Student s);

	List<Student> getStudents();

}
