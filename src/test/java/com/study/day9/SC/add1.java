package com.study.day9.SC;

import com.study.day9.SA.student1;
import com.study.day9.SB.A;
import com.study.day9.SB.B;
public class add1 {
	public static void main(String[] args) {
		//System.out.println("hello java");
		System.out.println("====student1===");
		student1 s=new student1("abc");
		
		System.out.println(s.show()+"\t"+s.getX1());
		s.setX1(80);//0~50
		System.out.println(s.show()+"\t"+s.getX1());

		System.out.println("====A===");
		A a=new A("a",85);
		//a.skill();

		System.out.println(a.show()+"\t"+a.getX1());
		a.setX1(80);//0~100--->is a A-->只限繼承方法
		//a.x1=-50;
		System.out.println(a.show()+"\t"+a.getX1());

		System.out.println("====B===");
		B b=new B("bb",74);
		//b.skill();
		System.out.println(b.show()+"\t"+b.getX1());
		b.setX1(120);//0~200
		System.out.println(b.show()+"\t"+b.getX1());
	}
}
