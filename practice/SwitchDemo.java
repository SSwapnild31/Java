package com.fuel.fuel;

import java.util.Scanner;

public class SwitchDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string number->");
		//int a=sc.nextInt();
		String a=sc.next();
		switch(a)
		{
			/*case 1:
			{
				System.out.print("This is case 1");
				break;
			}
			*/
			case "one": 
			{
				System.out.println("This is case one");
				break;
			}
			case "two":
			{
				System.out.println("This is case two");
				break;
			}
			case "three":
			{
				System.out.println("This is case three");
				break;
			}
			default :
				System.out.println("Wrong Choice..!");
		}
	}
}