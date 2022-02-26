package com.study.day13.lambdaEx2;
import java.util.List; 
import java.util.ArrayList;
class ABC3{
	List<? extends A> x1; // 上限到 A 的類別
	List<? super A> x2;   // 下限到 A 的類別	
}
public class exam3 {
	public static void main(String[] args) {
		ABC3 a = new ABC3();
		/*
		a.x1=new ArrayList<>();
		a.x1.add(new A());
		*/
		
		List<A> l = new ArrayList<>();
		l.add(new A());
		a.x1 = l;
		
		List<A_1> l2 = new ArrayList<>();
		a.x1 = l2;
		
		List<school1> l3 = new ArrayList<>();
		a.x1 = l3; // Type mismatch: cannot convert from List<school1> to List<? extends A>		
		a.x2 = l3;
		a.x2 = l;
		a.x2 = l2; // Type mismatch: cannot convert from List<A_1> to List<? super A> 		
	}		
}
