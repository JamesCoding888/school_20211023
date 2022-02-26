package com.study.day9.SB;

//一般不會用絕對路徑來寫，而是用 import
//com.web.day9.SA.student1
import com.study.day9.SA.student1;
import com.study.day9.SA.student2;
public class A extends student1 implements student2//com.SA.student1
{
	private int chi;
	public A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}
	public void skill()
	{
		System.out.println("A skill");
	}
	public String show()
	{
		return super.show()+"\t國文:"+chi;
	}
	public void setX1(int x1)
	{
		if(x1>=0 && x1<=100)
		{
			//super.setX1(x1);
			this.x1=x1;
		}
	}
}
