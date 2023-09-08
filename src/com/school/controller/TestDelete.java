package com.school.controller;

import com.school.service.StudentService;

public class TestDelete {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		boolean res =studentService.deleteStudentByIdStudent(1);
		System.out.println(res);
	}
}
