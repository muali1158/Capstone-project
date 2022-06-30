package com.shahzad.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahzad.management.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
