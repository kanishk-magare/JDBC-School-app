package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(5);
		student.setName("abc");
		student.setEmail("abc@gmail,com");
		
		StudentService studentService=new StudentService();
		Student s = studentService.saveStudent(student);
		if(s!=null) {
			System.out.println(s.getId()+" Saved succesfully");
		}
		
	}
}
 