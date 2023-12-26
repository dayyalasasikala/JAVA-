package org.jsp.sasidemo;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		System.out.println("what is your name");
		String name= sc .nextLine();
		System.out.printf("hii, how are u?\n");
		String status=sc.nextLine();
		System.out.println("what is your age?");
		int age=sc.nextInt();
		System.out.println("thankyou for your kind information");
		sc.close();
		
		
		
		
	
	
	

		
	}

}
