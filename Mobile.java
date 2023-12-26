package org.jsp.sasidemo;

public class Student {
	String name;
	String qualification;
	String branch;
	int yop;
	Student(String n,String q,String b,int y){
		this.name=b;
		this.qualification=q;
		this.branch=b;
		this.yop=y;
		}
	@Override
	public String  toString() {
		return this.name+" "+this.qualification+" "+this.branch+" "+this.yop;
		public static void Main(String[] args){
			Student s1=new Student("sasi","b-tech","cse",7809);
			Student s2=new Student("sasi","b-tech","cse",7809);
			Student s3=new Student("anu","b-tech","cse",7809);
			Student s4=new Student("sasi","b-tech","cse",7809);
			Student s5=new Student("sasi","b-tech","cse",7809);
			Student s6=new Student("sasi","b-tech","cse",7809);
			
		}
		
     
	System.out.println("realme","red",4500);
	System.out.println("redmi","red",5670);
    System.out.println("oops","black",4560);
	
	}


	}
	
	
