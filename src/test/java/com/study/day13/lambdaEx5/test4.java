package com.study.day13.lambdaEx5;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class test4 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(20,5,30,25);
		System.out.println(list1);
		System.out.println("======list1 stream======");
		Stream<Integer> stream1 = list1.stream();
		Consumer<Integer> consumper1 = (Integer c) -> System.out.print(c + " ");
		stream1.forEach(consumper1);
		System.out.println();
		System.out.println("======list1 stream 簡化======");
		list1.stream().forEach(c -> System.out.print(c + " "));
		System.out.println();
		System.out.println("======list1 filter > 20======");		
		list1.stream().filter((Integer s) -> s>20).forEach(c -> System.out.print(c + " "));
		System.out.println();
		System.out.println("======list1 filter > 20 並排序由小到大======");
		list1.stream().filter((Integer s) -> s>20).sorted().forEach(c -> System.out.print(c + " "));
	}
}
