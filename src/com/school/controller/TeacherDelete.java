package com.school.controller;

import java.util.Scanner;
import com.school.service.TeacherService;

public class TeacherDelete {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter id: ");
		int id = sc.nextInt();
		
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.deleteTeacherById(id);
		System.out.println(res);
		
		sc.close();
	}
}
