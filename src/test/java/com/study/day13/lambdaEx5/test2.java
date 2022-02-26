package com.study.day13.lambdaEx5;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student1 implements Comparable<student1>{
	private String name;
	private Integer sum;
	public student1(String name, Integer sum) {
		super();
		this.name = name;
		this.sum = sum; 
	}
	void show() {
		System.out.println(" 姓名:" + name + " 總分:"+sum);
	}

	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	@Override
	public int compareTo(student1 o) {
		return this.sum - o.sum; // 由小到大排序	
	}	
}
class student2 implements Comparable<student2>{
	private String name;
	private Integer sum;
	public student2(String name, Integer sum) {
		super();
		this.name = name;
		this.sum = sum;
	}
	void show() {
		System.out.println(" 姓名:" + name + " 總分:"+sum);
	}
	
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	@Override
	public int compareTo(student2 o) {
		return this.sum - o.sum; // 由小到大排序
	}
}
public class test2 {
	public static void main(String[] args) {
//		Map<student1, student2> map1 = new HashMap<>();
		List<student1> list1 = Arrays.asList(new student1("James", 100),
											 new student1("John", 60), 
											 new student1("Mary", 80));		
		List<student2> list2 = Arrays.asList(new student2("Harry", 70),
				 							 new student2("Chris", 60), 
				 							 new student2("Summer", 80));
		System.out.println("======list1======");
		for(student1 o: list1) {
			o.show();
		}
		System.out.println("======list1 Comparable======");
		Collections.sort(list1); 
		list1.forEach(s -> s.show());
		System.out.println("======list2======");		
		for(student2 o: list2) {
			o.show();
		}
		System.out.println("======list2 Comparable======");
		Collections.sort(list2);
		list2.forEach(s -> s.show());	
		
		System.out.println("======list1 comparator1======");
		Comparator<student1> comparator1 = new Comparator<student1>() {

			@Override
			public int compare(student1 o1, student1 o2) {
				
				return o1.getSum() - o2.getSum();
			}			
		};
		Collections.sort(list1, comparator1);
		for(student1 o : list1) {
			o.show();
		}
		System.out.println("======list1 comparator2======");
		Comparator<student1> comparator2 = (o1,o2) -> o1.getSum() - o2.getSum();
		Collections.sort(list1, comparator2);
		list1.forEach(s -> s.show());			
	}
}

