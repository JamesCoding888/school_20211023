package com.study.day13.lambdaEx4;
import java.util.function.Supplier;
class A{
	String show() {
		return "java8";
	}
}
public class supplierEx {
	public static void main(String[] args) {
		Supplier<String> supplier1 = new Supplier<String>() {
			@Override
			public String get() {				
				return "java8";
			}			
		};
		System.out.println(supplier1.get());
		
		Supplier<Integer> supplier2 =  () -> 123;
		System.out.println(supplier2.get());
		
		Supplier<A> supplier3 = () -> new A();
		System.out.println(supplier3.get());		
	}
}
