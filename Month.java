package org.jsp.sasidemo;

import java.util.Scanner;

public class Month {

	private static Scanner sc;

	public static void main(String[] args) {
    sc = new Scanner(System.in);
    System.out.println("enter the month number");
    int n=sc.nextInt();
    if(n==1||n==3||n==5||n==7||n==9||n==11) 
    	System.out.println("31days");
    	else if(n==4||n==6||n==8)
    		System.out.println("30days");
    	else if(n==2) 
    		System.out.println("28/29 days");
    	else 
    		System.out.println("invalid");
    		
    	}
}
