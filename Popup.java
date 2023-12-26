package org.jsp.sasidemo;

import java.util.Scanner;

public class Popup {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the2 double values");
  double a=sc.nextDouble();
  double b=sc.nextDouble();
  System.out.println("sum is"+(a+b));
  System.out.println("diff is"+(a-b));
  System.out.println("product is"+(a*b));
  System.out.println("coefficient is "+(a/b));
  System.out.println("remainder is "+(a%b));
  
	}

}
