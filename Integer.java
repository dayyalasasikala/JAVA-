package org.jsp.sasidemo;

import java.util.Scanner;

public class Integer {

	private static Scanner sc;

	public static void main(String[] args) {
    System.out.println("enterthe integer values");
    sc = new Scanner(System.in);
    int n=sc.nextInt();
     int d1=n/10;
     int d2=n%10;
     int Sum = d1+d2+d1*d2;
     if(Sum==n) {
    	 System.out.println(n+ "is special two  digit");
    	 
     }
    	 
     
	}

}
