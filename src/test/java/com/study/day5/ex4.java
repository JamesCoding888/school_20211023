package com.study.day5;
class ex4
{
	public static void main(String[] args) {
		int[] x=new int[3];
		int[] y=new int[]{10,20,30};
		//x[3]=100;
		//y[3]=22;
		System.out.println(y);
		y=new int[10];
		System.out.println(y);
		y[3]=100;
		System.out.println(y[3]);

		for(int i=0;i<y.length;i++)
		{
			System.out.println("y["+i+"]="+y[i]);
		}

	}
}
