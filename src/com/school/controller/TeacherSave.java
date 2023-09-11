package com.school.controller;

import java.util.Scanner;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherSave {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter name: ");
		String name = sc.nextLine();
		
		System.out.print("enter email: ");
		String email = sc.nextLine();
		
		System.out.print("enter salary: ");
		int sal = sc.nextInt();
		
		
		Teacher teacher = new Teacher();
		teacher.setId(id);
		teacher.setName(name);
		teacher.setEmail(email);
		teacher.setSal(sal);
		
		TeacherService teacherService = new TeacherService();
		Teacher t = teacherService.saveTeacher(teacher);
		
		if(t!=null) {
		System.out.println(t.getId() + " saved sucessfully");
		}

		sc.close();
	}
}
