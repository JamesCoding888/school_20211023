package com.study.day6;
class add2
{
	public static void main(String[] args) {
		/*Order[][] x=new Order[2][2];
		System.out.println(x);

		System.out.println(x[0]);
		System.out.println(x[0][0]);
		System.out.println(x[1]);
		System.out.println(x[1][0]);*/

		Order[][] x=new Order[2][];
		x[0]=new Order[2];
		x[1]=new Order[4];




		x[0][0]=new Order("a1",4,5);
		x[0][1]=new Order("a2",1,5);

		x[1][0]=new Order("b1",4,5);
		x[1][1]=new Order("b2",4,5);
		x[1][2]=new Order("b3",4,5);
		x[1][3]=new Order("b4",4,5);

		System.out.println("=======================");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t");
				x[i][j].show();
			}
			System.out.println();
		}
		System.out.println("=======================");

		for(Order[] o:x)
		{
			System.out.println(o);
			for(Order u:o)
			{
				System.out.print(u+"\t");
				u.show();
			}
			System.out.println();
		}




	}
}