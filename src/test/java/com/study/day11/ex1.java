package com.study.day11;
import java.util.InputMismatchException;

class ex1
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[] x=new int[3];
		System.out.println("請輸入索引碼");
		try
		{
			int n=sc.nextInt();//new InputMismatchException()
			x[n]=100;//new ArrayIndexOutOfBoundsException()

			System.out.println("輸入分母");

			int m=sc.nextInt();
			System.out.println("x["+n+"]/"+m+"="+x[n]/m);//new ArithmeticException()
			
			/*for(int i=1;i<=10;i++)
			{
				System.out.println("i="+i+"\thello");
			}*/
		}
		catch(ArrayIndexOutOfBoundsException|
			InputMismatchException|ArithmeticException e)
		{
			System.out.println("重填");
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException e)//ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException()
		{
			System.out.println("索引碼為0~2");
			e.printStackTrace();

		}
		catch(InputMismatchException e)
		{
			System.out.println("索引碼須為整數");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("分母不可為0");
			e.printStackTrace();
		}*/
		catch(RuntimeException e)//e=new ArithmeticException()
		{
			System.out.println("重填");
			e.printStackTrace();
		}
		finally
		{
				for(int i=1;i<=10;i++)
				{
					System.out.println("i="+i+"\thello");
				}
		}
		for(int i=1;i<=10;i++)
				{
					System.out.println("i="+i+"\thello , no finally");
				}
	}
}