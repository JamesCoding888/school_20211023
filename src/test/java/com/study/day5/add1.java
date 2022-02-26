package com.study.day5;
class add1
{
	public static void main(String[] args) {
		//FV.pv=100000;
		FV.setPv(10000);
		System.out.println(FV.CompanyName());
		System.out.println(FV.Title());
		FV f1=new FV(0.01,5);
		FV f2=new FV(0.012,4);
		FV f3=new FV(0.013,3);
		FV f4=new FV(0.014,2);


		f1.show();
		f2.show();
		f3.show();
		f4.show();

		System.out.println("==========================");
		//FV.pv=-200000;
		//f1.r=-0.15;
		System.out.println(FV.CompanyName());
		System.out.println(FV.Title());
		f1.setR(0.016);

		f1.show();
		f2.show();
		f3.show();
		f4.show();
		System.out.println("==========================");
		System.out.println(FV.cal(10,20));
		System.out.println(f1.cal(20,20));
		System.out.println(f2.cal(30,20));


	}
}