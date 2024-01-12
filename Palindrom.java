package org.com.praveendemo;

public class Palindrom {

	public static void main(String[] args) {
      
		int number=141;
		int temp=number;
		int rev=0,rem;
		while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
	    temp=temp/10;
			
		}
		if(number==rev) {
			System.out.println(number+"is palindrome number");
		}
		else {
			System.out.println(number+"is not palindrome number");
		}
	}

}
