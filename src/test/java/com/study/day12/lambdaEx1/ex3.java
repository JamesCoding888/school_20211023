package com.study.day12.lambdaEx1;
import java.util.ArrayList; 
import java.util.List;
interface book3<T,E>{
	E bookPrice(T price);
}
class bookStore3 implements book3<Double,String>{
	@Override
	public String bookPrice(Double price) {
		return "價格="+price;
	}	
}
class bookStore3_2 implements book3<String,Integer>{
	@Override
	public Integer bookPrice(String price) {
		return Integer.parseInt(price);
	}	
}
class bookStore3_3 implements book3<ArrayList<String>,List<Integer>>{
	@Override
	public List<Integer> bookPrice(ArrayList<String> price) {		
		List<Integer> l=new ArrayList<>();
		for(String o:price)
		{
			// 將 ArrayList<String> price 的 elements 經 Integer.parseInt(o) 轉 int type
			// 但在 compiler 編譯器會自動將 int type auto-boxing to Integer type
			l.add(Integer.parseInt(o)); 
		}		
		return l;
	}
}
public class ex3 {
	public static void main(String[] args) {	
		ArrayList<String> price=new ArrayList<>();
			price.add("2");
			price.add("3");
			price.add("66");
				
		bookStore3_3 b=new bookStore3_3();
		List<Integer> l=b.bookPrice(price);
		System.out.println(l);
		int sum=0;
		for(Integer o:l){
			sum=sum+o;
		}
		System.out.println(sum);
	}
}