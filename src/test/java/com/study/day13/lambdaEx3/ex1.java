package com.study.day13.lambdaEx3;
import java.util.List; 
import java.util.ArrayList;
interface book1{
	void bookName(String name);
	double bookPrice(double price);
}
public class ex1 {
	public static void main(String[] args) {
		book1 b1 = new book1() {
			@Override
			public void bookName(String name) {
				System.out.println("書名" + name);
				
			}
			@Override
			public double bookPrice(double price) {
				// TODO Auto-generated method stub
				return price;
			}			
		};
		book1 b2 = new book1() {

			@Override
			public void bookName(String name) {
				// TODO Auto-generated method stub				
			}	
			@Override
			public double bookPrice(double price) {
				// TODO Auto-generated method stub
				return 0;
			}			
		};		
		List<book1> l = new ArrayList<>();
		l.add(b1);
		l.add(b2);
		l.add(new book1() {
			@Override
			public void bookName(String name) {
				// TODO Auto-generated method stub				
			}
			@Override
			public double bookPrice(double price) {
				// TODO Auto-generated method stub
				return 0;
			}		
		});
	}	
}

