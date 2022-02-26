package com.study.school;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		school s = new school("james", 10.1, 10.2);//->將 school 轉出 jar 檔
		System.out.println(s);
		// 成功 將 external school.jar import to Referrenced Libraries
		// 這是業界常會使用的方式，面試的時候會問，您會不會串接其他第三方的資料!!!
	}

}
