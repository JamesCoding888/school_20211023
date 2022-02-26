package com.study.day12.lambdaEx1;
interface book2<T>{
	T bookPrice(T price);
	
}
class bookStore2 implements book2<Double>{
	@Override
	public Double bookPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}	
}
class bookStore2_2 implements book2{
	@Override
	public Object bookPrice(Object price) {
		// TODO Auto-generated method stub
		return null;
	}	
}
public class ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
