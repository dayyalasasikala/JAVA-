package org.jsp.oopsdem;

import java.util.ArrayList;

public class Teacher {
	public static void main(String[] args) {
//		Student s= new Student(235);
//		s.setStudentAttendence(true);
//		s.getStudentAttendence(false);
		
//		System.out.println(010==8.0); 
//		System.out.println(8.0==010); 

		
//		int a[]= {5,10,20,30,40,50};
//		for(int i=1;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//			
//		}
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(4, 23);
		l.remove(0);
		System.out.println(l);
	}

}
