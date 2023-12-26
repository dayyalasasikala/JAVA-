package org.jsp.sasidemo;

import java.util.*;
import java.util.Vector;
public class Demo {

	public static void main(String[] args) {
     ArrayList a1=new   ArrayList();
     a1.add(true);
     a1.add('x');
     a1.add("java");
     a1.add(10);
     a1.add(12.99);
     for(int i=0;i<a1.size();i++)
     System.out.println(a1.get(i));
	}
}

