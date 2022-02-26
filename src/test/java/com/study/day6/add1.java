package com.study.day6;
class add1
{
	public static void main(String[] args) {
		Order[] x=new Order[3];//x[0],x[1].x[2]-->class--->null
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

		x[0]=new Order("a",1,2);
		x[1]=new Order("b",3,2);
		x[2]=new Order("b",1,3);

		System.out.println("========================");
		System.out.println(x);
		System.out.print(x[0]+"\t");
		x[0].show();
		System.out.print(x[1]+"\t");
		x[1].show();
		System.out.print(x[2]+"\t");
		x[2].show();

		System.out.println("========================");

		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+"\t");
			x[i].show();
		}

		System.out.println("========================");

		for(Order o:x)
		{
			System.out.print(o+"\t");
			o.show();
		}



	}
}