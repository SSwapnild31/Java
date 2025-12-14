package com.modifiers.example;


public class PrivateEx1 {
	private int id=10;
	private PrivateEx1()
	{
		
	}
	static void demo1() {
		System.out.println("Static method");
	}
	private void demo() {
		System.out.println(id);
	}
	void display() {
		demo();
	}
}
