package com.study.day5;
class FV
{
	private static int pv;//類別產生
	private double r;
	private int n;
	private int fv;

	FV(double r,int n)
	{
		
		this.r=r;
		this.n=n;

		fv=(int)(pv*(1+r*n));
	}

	/*static*/ void setR(double r)
	{
		this.r=r;
	}

	static void setPv(int pv)
	{
		FV.pv=pv;//this為物件-->static與this衝突
	}

	static String CompanyName()
	{
		return "巨匠電腦";
	}

	static String Title()
	{
		return "本金\t利率\t期數\t單利本利和";
	}

	static int cal(int x,int y)
	{
		return x*y;//變數與field沒關係
	}



	void show()
	{
		fv=(int)(pv*(1+r*n));
		System.out.println(pv+"\t"+r+"\t"+n+"\t"+fv);
	}
}