package com.fuel.example;

public class StaticMethodWithObjectAndClass
{
	void Data()
	{
		System.out.println("Data Method");
	}
	static void demo()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args)
	{
		StaticMethodWithObjectAndClass d1 = new StaticMethodWithObjectAndClass();
		d1.Data();
		d1.demo();		//static method called using object
		StaticMethodWithObjectAndClass.demo();	//static method called using class name
	}
}