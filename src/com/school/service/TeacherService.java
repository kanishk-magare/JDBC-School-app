package com.school.service;

import com.school.dao.TeacherDao;
import com.school.dto.Teacher;

public class TeacherService {

	TeacherDao teacherDao = new TeacherDao();

	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}

	public boolean deleteTeacherById(int id) {
		return teacherDao.deleteTeacherById(id);
	}

	public boolean updateTeacherBySal(int id, int sal) {
		return teacherDao.updateTeacherBySal(id, sal);
	}

	public void getTeachersById(int id) {
		teacherDao.getTeachersById(id);
	}

	public void getAllTeachers() {
		teacherDao.getAllTeachers();
	}

}
