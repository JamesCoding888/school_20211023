package com.study.day13.lambdaEx4;
import java.util.function.Supplier;
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
	}
}
