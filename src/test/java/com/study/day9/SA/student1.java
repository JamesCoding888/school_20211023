package com.study.day9.SA;

public class student1//com.SA.student1
{
	private String name;
	//public int x1;
	protected int x1;
	public student1(String name)
	{
		this.name=name;
		x1=10;
	}

	public String show()
	{
		return "名:"+name;
	}

	public int getX1()
	{
		return x1;
	}

	public void setX1(int x1)
	{
		if(x1>=0 && x1<=50)
		{
			this.x1=x1;
		}
	}
}