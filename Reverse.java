package org.com.praveendemo;

import java.io.PrintStream;
import java.util.Scanner;

public class Reverse {



	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();//1234
//		1.using alg
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;//0+1234%10=4 40+3=43 430+2=432 4320+2=4321
//			
//			num=num/10;// 1234/10=123 123/10=12 12/10=1 1/10=0
//			
		
////		usisng stringbuffer:
//		
////		StringBuffer sb= new StringBuffer(String.valueOf(num));
////		
////		StringBuffer rev=sb.reverse;
////			
		//logic 3:stringbuilder:-
		
		StringBuilder sb= new StringBuilder();
		sb.append(num);
		 StringBuilder rev=sb.reverse();
		
		
			
			
		
		System.out.println("reverse number is "+rev);
		
		
		
}


}

