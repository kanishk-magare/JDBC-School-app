package com.school.controller;

import com.school.service.StudentService;

public class GetStudent {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		int res = studentService.getstudent(2);
		System.out.println(res);
	}

}
