package com.staticexample.example;

public class StaticExample2 {
	static {
		System.out.println("1st static");
	}
	static {
		System.out.println("2nd static");
	}
	static void add()
	{
		System.out.println("This is add methos");
	}
}