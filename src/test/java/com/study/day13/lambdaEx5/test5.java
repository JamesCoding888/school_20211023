package com.study.day13.lambdaEx5;
import java.util.Arrays;
import java.util.List;
class school
{
	private String name;
	private Integer sum;
	public school(String name, Integer sum) {
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
	void show()
	{
		System.out.println("名:"+name+"\t總分:"+sum);
	}
}
public class test5 {
	public static void main(String[] args) {
		List<school> list1 = Arrays.asList(
				new school("NTU", 80),
				new school("NCUE", 90),
				new school("UCLA", 70)
				);
		list1.stream()			 
			 .peek(s -> s.show())
			 .filter((school s) -> s.getSum()>70)			 
			 .sorted((school s1, school s2) -> s1.getSum() - s2.getSum())
			 .forEach((school s) -> s.show());
	}
}