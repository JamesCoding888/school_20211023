package com.study.day13.lambdaEx3;
interface book3<T extends Object>{ // T 默認 extends Object - 可忽略不寫
	T bookStore(T n); // T extends Object
}
public class ex3 {
	public static void main(String[] args) {
		book3<String> b = (String n) -> "書名" + n;
		book3<Integer> b2 = (n) -> n + 100;
		book3<Double> b3 = n -> n;		
		// book3<Double> 注意 Generics 裡面的 Type, 若改成 double Syntax 不對
		// 因為 T extends Object
		book3<Double> b4 = book3Show::b1; 
		System.out.println(b.bookStore("java8"));
		System.out.println(b2.bookStore(100));
		System.out.println(b3.bookStore(2.0));
		System.out.println(b4.bookStore(-1.0));
	}
}
class book3Show{
	public static Double b1(double p) {
		if(p >= 0) {
			return p * 0.95;
		} else {
			return 0.0; // int -> Double
		}
	}
}