package com.school.controller;

import com.school.service.StudentService;

public class StudentUpdate {
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		boolean res =studentService.update(1,"Hamza", "hamza@gmail.com");
		System.out.println(res);
		
	}
}
