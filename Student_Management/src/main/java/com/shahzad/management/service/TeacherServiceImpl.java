package com.shahzad.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shahzad.management.model.Teacher;
import com.shahzad.management.repo.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService{

	private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(Long id) {		
		teacherRepository.deleteById(id);
	}
}