package org.jsp.user.controller;

import java.util.Scanner;

import org.jsp.user.dao.UserDao;
import org.jsp.user.dto.User;

public class UserController {
	 static Scanner s= new Scanner(System.in);
	 static UserDao dao=new UserDao();
	 public static void main(String[] args) {
		 System.out.println("1.Register");
		 System.out.println("2.Edit Your Details");
		 System.out.println("3.Find User By ID");
		 System.out.println("4.Delete User By Id");
		 System.out.println("5.Verify User By Email and Password");
		 System.out.println("6.Verify User By Phone and Email");
		 System.out.println("7.Verify User id and Password");
		 int Choice=s.nextInt();
		 switch(Choice){
		 case 1:{
			 save();
			 break;
			 
		 }
		 case 2:{
			 update();
			 break;
			 
		 }
		 case 3:{
			 break;
			 
		 }
		 case 4:{
			 break;
			 
		 }
		 
			 
		 }
		 
	}
		private static void update() {
		
	}
		private static void save() {
		System.out.println("Enter your name,email,gender,phone and password to register");
		String name=s.next();
		String email=s.next();
		String gender=s.next();
		long phone=s.nextLong();
		String password=s.next();
		User u =new User();
        u.setName(name);
        u.setGender(gender);
        u.setEmail(email);
        u.setPassword(password);
        u.setPhone(phone);
        u=dao.saveUser(u);
    System.out.println("your account is updated");
	}

		
		
	}


