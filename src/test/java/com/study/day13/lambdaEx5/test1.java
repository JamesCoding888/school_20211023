package com.study.day13.lambdaEx5;
import java.util.List;
import java.util.ArrayList;
public class test1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for(Integer o : list) {
			System.out.println(o);
		}
	}
}
