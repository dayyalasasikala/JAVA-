package org.jsp.sasidemo;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a value");
     int a=sc.nextInt();
     System.out.println("enter b value");
     int b=sc.nextInt();
     Sum s=new Sum();
    int y =s.sum(a,b);
    System.out.println(y);
     
	}
	public  int sum(int a,int b) {
		
	int sum=a+b;
	return sum;
	
	
      
	}
	

}
