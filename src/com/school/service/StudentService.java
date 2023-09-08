package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student student) {
		Student s=studentDao.saveStudent(student);
	    return s;	
	}
	
	public boolean deleteStudentByIdStudent(int id) {
		return studentDao.deleteStudentById(id);
	}
	
	public int getstudent(int id) {
		return studentDao.getStudent(id);
	}

	public void getAll() {
		studentDao.getAll();
	}
	
}

