package com.study.day13.lambdaEx3;
interface book2{
	String bookName(String name);
}
public class ex2 {
	public static void main(String[] args) {
		// book2 b=(String name)->"書名="+name;
		// book2 b=( name)->"書名="+name;
		// book2 b=name->"書名="+name;
		book2 b = name -> ("書名=" + name);

		System.out.println(b.bookName("java"));

		book2 b2 = book2Show::b2;

		System.out.println(b2.bookName("def"));
	}

}
class book2Show {
	public static String b1(String name) {
		if (name != "abc") {
			return "書名=" + name;
		} else {
			return "重寫";
		}
	}
	public static String b2(String name) {
		if (name != "def") {
			return "java書名=" + name;
		} else {
			return "重寫";
		}
	}
}
