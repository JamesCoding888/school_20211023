package com.study.day13.lambdaEx2;
import java.util.List;
import java.util.ArrayList;
class ABC2{
	A[] x1;
	List<A> x2;
	
}
public class exam2 {

	public static void main(String[] args) {
		ABC2 a = new ABC2();
		System.out.println(a + "\t" + a.x1);
		
		a.x1=new A[3];
		System.out.println(a+"\t"+a.x1+"\t"+a.x1[0]);
		
		a.x1[0]=new A();
		System.out.println(a+"\t"+a.x1+"\t"+a.x1[0]+"\t"+a.x1[1]);
		
		a.x1[1]=new A_1();
		System.out.println(a+"\t"+a.x1+"\t"+a.x1[0]+"\t"+a.x1[1]);
		
		System.out.println("====================================");
		a.x2=new ArrayList<>();
		a.x2.add(new A());
		a.x2.add(new A_1());
		a.x2.add(new A());
		
		for(A o:a.x2)
		{
			System.out.print(o+" ");
		}
		
	}

}
