package com.fuel.example;

public class StaticBlock
{
	static {
		System.out.println("This is first static");
	}
	static {
		System.out.println("This is second static");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method");
	}
}