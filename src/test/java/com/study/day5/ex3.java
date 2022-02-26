package com.study.day5;
class ex3
{
	public static void main(String[] args) {
		
		int[] x=new int[]{10,20,30};
		int[] y=new int[]{40,50,60};


		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("======================");

		//x=y;//位址=位址--->同一個--->回收記憶體 x-->garbage collection
		x[0]=y[0];//直=值--->copy
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("======================");
		x[0]=200;

		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);

		x=null;//int[] x=null;

		System.out.println("x="+x);
		//System.out.println("x[0]="+x[0]);
		System.out.println(x.length); // x 陣列已經被 null 是沒有陣列長度的
		System.out.println("y="+y);





		/*int x=10;
		int y=20;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("======================");
		x=y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("======================");
		x=100;
		System.out.println("x="+x);
		System.out.println("y="+y);*/
	}
}