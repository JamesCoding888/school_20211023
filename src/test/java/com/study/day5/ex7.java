package com.study.day5;
class ex7
{
	public static void main(String[] args) {
		int[][] x = new int[2][];
		x[0]=new int[3];
		x[1]=new int[4];

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
