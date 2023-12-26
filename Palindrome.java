package org.jsp.sasidemo;


public class Palindrome{

public static void main(String[] args) {
	int number=111;
	int temp=number;
	int rev = 0;
	while(temp!=0)
	{
		int rem = temp%10;
		rev=(rev*10)+rem;
		temp=temp/10;
	}
	if(temp==rev) {
		System.out.println(number+" is palindrome");
	}
	else {
		System.out.println(number+"is not palindrome");
	}

}
}

	
