package com.study.day13.lambdaEx4;
import java.util.function.Predicate;
public class predicateEx {
	public static void main(String[] args) {
		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {				
				return t>0;
			}};

		boolean predicate2 =  predicate.test(10);
		System.out.println(predicate2);
		
		Predicate<Integer> predicate3 = (Integer p) -> p>0;	
		System.out.println(predicate3.test(6));	
	}
}
