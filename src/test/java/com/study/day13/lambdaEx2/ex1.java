package com.study.day13.lambdaEx2;
import java.util.ArrayList;  
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ex1{
	public static void main(String[] args) {
		school1[] s1 = new school1[3];
		s1[0] = new A();
		s1[1] = new B();
		s1[2] = new A_1();		
		ArrayList<school1> a1 = new ArrayList<>();
		a1.add(new A());
		a1.add(new B());
		a1.add(new A_1());	
		List<school2> l1=new ArrayList();
		l1.add(new A());
		l1.add(new B());
		l1.add(new A_1());
		System.out.println(l1);				
		Set<school1> s2=new HashSet();
		s2.add(new A());
		s2.add(new B());
		s2.add(new A_1());
	}
}
