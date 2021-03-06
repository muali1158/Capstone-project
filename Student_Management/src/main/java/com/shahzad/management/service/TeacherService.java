package com.shahzad.management.service;

import java.util.List;


import com.shahzad.management.model.Teacher;
public interface TeacherService {
List<Teacher> getAllTeachers();
	
Teacher saveTeacher(Teacher teacher);
	
Teacher getTeacherById(Long id);
	
Teacher updateTeacher(Teacher teacher);
	
	void deleteTeacherById(Long id);
}
