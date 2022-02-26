package com.study.day5;
class ex6
{
	public static void main(String[] args) {
		int[][][] x=new int[2][2][3];

		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[0][0]);
		System.out.println(x[0][0][0]);

		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t"+x[i][j]);
				for(int k=0;k<x[i][j].length;k++)
				{
					System.out.println("\t\t"+x[i][j][k]);
				}
			}
		}

		System.out.println("============================");

		for(int[][] o:x)
		{
			System.out.println(o);
			for(int[] u:o )
			{
				System.out.println("\t"+u);
				for(int v:u)
				{
					System.out.println("\t\t"+v);
				}
			}
		}
	}
}