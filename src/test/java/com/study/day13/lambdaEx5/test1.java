package com.study.day13.lambdaEx5;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class test1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		for(Integer o : list) {
			System.out.println(o);
		}
		System.out.println("Collections.sort() 結果");
		Collections.sort(list);
		for(Integer o : list) {
			System.out.println(o);
		}
	}
}
