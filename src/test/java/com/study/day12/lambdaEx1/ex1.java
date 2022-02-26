package com.study.day12.lambdaEx1;
interface Store1{
	void StreName(String name);
}
interface book1 extends Store1
{
	double pi=10.2; // public static final 省略
	void bookName(String name); // public abstract 省略
	default double bookPrice(double price)
	{
		return price*0.95;
	}
	static double bookPrice2(double price)
	{
		return price*0.8;
	}
}
class bookStore1 implements book1{
	// b1.bookName("java");
	
	@Override
	public void bookName(String name) {
		System.out.println(name);		
	}

	@Override
	public void StreName(String name) {
	}
}
public class ex1{
	public static void main(String[] args) {
		book1 b1 = new bookStore1();
		b1.bookName("java");
		
		// Lambda
		Store1 b2 = ((String name) -> System.out.println(name));
		b2.StreName("Python");
	}
}