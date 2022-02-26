package com.study.day5;
class ex9
{
	public static void main(String[] args) {
		member[]  m=new member[3];//m[0],m[1],m[2]-->名字統一管理
		System.out.println(m);
		
		m[0]=new member("a","o");
		m[1]=new member("b","o");
		m[2]=new member("c","o");

		System.out.println(m[0]);
		//m[0].show();
		System.out.println(m[1]);
		System.out.println(m[2]);
	}
}


