package com.study.day13.lambdaEx2;
class ABC
{
	int show1(int x) {return x;}
	int show2(int[] x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}		
		return sum;
	}	
	int show3(int... x)//參數列表--->也是陣列
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}	
		return sum;
	}	
	int[] x;
	int x1;
	A x2; 
	Integer x3;
	A[] x4;
}
public class exam {
	public static void main(String[] args) {
		ABC a=new ABC();
		System.out.println(a.show1(100));				
		int[] x=new int[] {30,20,30};
		System.out.println(a.show2(x));
		System.out.println(a.show3(x));
		System.out.println(a.show3(40,50,60,30));
		a.x = x;
		System.out.println(a.x[0]);
		System.out.println(a.x1); // 沒有初始化 視為 0
		System.out.println(a.x2); // 沒有初始化 視為 null
		System.out.println(a.x3); // 沒有初始化 視為 null		
		a.x2=new A();
		a.x2=new A_1();
		//a.x2=new school1();		
		a.x4 = new A[3];	
		System.out.println(a.x4 + "\t" + a.x4[0]); // a.x4[0] -> null
		a.x4[0] = new A();
		System.out.println(a.x4 + "\t" + a.x4[0]);	
	}
}