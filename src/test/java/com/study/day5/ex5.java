package com.study.day5;
class ex5
{
	public static void main(String[] args) {
		/*int[] x=new int[3];
		int[] y=new int[3];*/


		//int[][] x=new int[2][3];
		int[][] x=new int[][]
		{
			{10,20,30},
			{40,50,60},
			{52,41,62}
		};

		System.out.println(x);
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[0].length);
		System.out.println(x[0][0]);
		//System.out.println(x[0][0].length);
		System.out.println(x[1]);
		System.out.println(x[1][0]);

		System.out.println("=====================");

		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\tx["+i+"]["+j+"]="+x[i][j]);
			}
		}

		System.out.println("=====================");

		for(int[] o:x)
		{
			System.out.println(o);
			for(int u:o)
			{
				System.out.println("\t"+u);
			}
		}
	}
}