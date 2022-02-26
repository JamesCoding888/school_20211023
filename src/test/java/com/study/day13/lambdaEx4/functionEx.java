package com.study.day13.lambdaEx4;
import java.util.function.Function;
public class functionEx {
	public static void main(String[] args) {
		Function<String, Integer> function1 = new Function<String, Integer>(){
			@Override
			public Integer apply(String t) {
				
				return Integer.parseInt(t);
			}			
		};
		System.out.println(function1.apply("123"));
		
		Function<String, Integer> function2 = (String s) -> Integer.parseInt(s);		
		System.out.println(function2.apply("321"));		
	}
}
