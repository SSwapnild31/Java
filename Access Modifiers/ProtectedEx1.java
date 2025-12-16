package com.modifiers.example;

public class ProtectedEx1
{
	protected int a;
	protected void data() 
	{
		System.out.print(a);
	}
	public static void main(String[] args) 
	{
		ProtectedEx1 p1 = new ProtectedEx1();
		p1.a=10;
		p1.data();
	}
}