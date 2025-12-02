package com.eureka.admission.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.admission.app.model.Student;

@Repository
public interface AdmissionRepository extends JpaRepository<Student, Integer>{

}
