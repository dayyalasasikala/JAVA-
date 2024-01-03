package org.jsp.numdemo;

import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {
     int p,q=1,r=3;
     p=0;
     System.out.print("1 3");
     while(p<=18) {
    	 p=q+r;
    	 q=r;
    	 r=p;
     }
	}

}

