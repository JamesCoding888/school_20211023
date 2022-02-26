package com.study.day6;
class add3
{
	public static void main(String[] args) {
		Order[][][] x=new Order[2][][];
		x[0]=new Order[2][];
		x[0][0]=new Order[2];
		x[0][1]=new Order[3];

		x[1]=new Order[3][];
		x[1][0]=new Order[2];
		x[1][1]=new Order[3];
		x[1][2]=new Order[4];


		x[0][0][0]=new Order("a1",4,5);
		x[0][0][1]=new Order("a2",4,5);

		x[0][1][0]=new Order("b1",4,5);
		x[0][1][1]=new Order("b2",4,5);
		x[0][1][2]=new Order("b3",4,5);


		x[1][0][0]=new Order("c1",4,5);
		x[1][0][1]=new Order("c2",4,5);

		x[1][1][0]=new Order("d1",4,5);
		x[1][1][1]=new Order("d2",4,5);
		x[1][1][2]=new Order("d3",4,5);

		x[1][2][0]=new Order("e1",4,5);
		x[1][2][1]=new Order("e2",4,5);
		x[1][2][2]=new Order("e3",4,5);
		x[1][2][3]=new Order("e4",4,5);


		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t"+x[i][j]);
				for(int k=0;k<x[i][j].length;k++)
				{
					System.out.print("\t\t"+x[i][j][k]);
					x[i][j][k].show();
				}
			}
		}

		System.out.println("========================");

		for(Order[][] o:x)
		{
			System.out.println(o);
			for(Order[] u:o)
			{
				System.out.println("\t"+u);
				for(Order v:u)
				{
					System.out.print("\t\t"+v);
					v.show();
				}
			}
		}


	}
}