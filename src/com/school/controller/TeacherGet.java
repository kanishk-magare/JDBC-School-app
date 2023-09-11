package com.school.controller;

import java.util.Scanner;

import com.school.service.TeacherService;

public class TeacherGet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter id to get the row: ");
		int id = sc.nextInt();

		TeacherService teacherService = new TeacherService();
		teacherService.getTeachersById(id);

		sc.close();
	}
}
