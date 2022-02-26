package com.study.day13.lambdaEx5;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Order {
	private String name;
	private Integer sum;

	public Order(String name, Integer sum) {
		super();
		this.name = name;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	void show() {
		System.out.println("水果名:" + name + "    金額:" + sum);
	}
}
public class test3 {
	public static void main(String[] args) {
		List<Order> list1 = Arrays.asList(
					new Order("apple", 100),
					new Order("banana", 300),
					new Order("orange", 200)
				);
		for(Order o : list1) {
			o.show();
		}
		System.out.println("======list1 comparator1======");
		Comparator<Order> comparator1 = (Order o1, Order o2)-> o1.getSum() - o2.getSum();
		Collections.sort(list1, comparator1);
		list1.forEach(o -> o.show());
		System.out.println("======list1 comparator1 簡化語法======");
		Collections.sort(list1, (Order o1, Order o2)-> o1.getSum() - o2.getSum());
		list1.forEach(o -> o.show());
	}
}
