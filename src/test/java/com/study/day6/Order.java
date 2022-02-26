package com.study.day6;

class Order
{
	private String name;
	private int Lcd;
	private int Ram;
	private int Sum;

	Order(String name,int Lcd,int Ram)
	{
		this.name=name;
		this.Lcd=Lcd;
		this.Ram=Ram;
		Sum=Lcd*4900+Ram*1280;
	}

	void show()
	{
		System.out.println("名:"+name+
			"\tLcd:"+Lcd+
			"\tRam:"+Ram+
			"\tSum:"+Sum);
	}
}