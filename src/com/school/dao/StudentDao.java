package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	HelperClass helperClass= new HelperClass();
	Connection connection = null;
	int i =0;
	
	//to get all
	public void getAll() {
		connection=helperClass.getConnection();
		String sql = "SELECT * FROM student";
		
		try {
			PreparedStatement preparedStatement =  connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));	
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	//to get student row
	public int getStudent(int id) {
		connection = helperClass.getConnection();
		String sql = "SELECT * FROM student WHERE Id =?";
		
		
		//create statement
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//passed the values to delimiter/placeholders---->?
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("======================");
			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}return id;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//to delete a student
	public boolean deleteStudentById(int id) {
		connection =helperClass.getConnection();
		String sql = "DELETE FROM student WHERE id=?";
		int i=0;
		
		//create statement
		try {
			PreparedStatement preparedStatement =
			connection.prepareStatement(sql);
			//passed the values to delimiter/placeholders---->?
			
			preparedStatement.setInt(1, id);
			
			//execute statement
		 i =	preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if(i>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	//to save a student data
	public Student saveStudent(Student student) {
		connection=helperClass.getConnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		
	try {
		//create statement
		PreparedStatement preparedStatement=
				connection.prepareStatement(sql);
		//passed the values to delimiter/placeholders---->?
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getName());
		preparedStatement.setString(3, student.getEmail());
		//execute
		preparedStatement.execute();
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		try {
			
			connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	return student;
	
	}
}
