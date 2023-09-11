package com.school.controller;

import java.util.Scanner;
import com.school.service.TeacherService;

public class TeacherUpdate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter id: ");
		int id = sc.nextInt();

		System.out.print("enter salary to be updated: ");
		int sal = sc.nextInt();
		
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.updateTeacherBySal(id, sal);
		System.out.println(res);
		
		sc.close();
	}
}
