package com.study.day13.lambdaEx4;
import java.util.function.Consumer;
public class consumerEx {
	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}			
		};			
		consumer.accept("Java8");
		
		Consumer<String> consumer2 = (String c) -> System.out.println(c);
		consumer2.accept("Java8");
	}
}
