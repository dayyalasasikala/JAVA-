package org.jsp.sasidemo;

public class Overloading {
	
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	void add(int  x,int y,int z)
	{
		int res=x+y+z;
		System.out.println(res);
	}
	public static void main(String[] args) {
	 Overloading o1=new Overloading();
	 o1.add(20,40);
	 }

}
// one method with some name but different arguments