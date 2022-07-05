package com.shahzad.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahzad.management.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
