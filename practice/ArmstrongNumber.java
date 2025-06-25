package code.java.example;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Number -> ");
		int num = sc.nextInt();
		sc.close();
		
		int originalNum=num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
			sum=sum+(digit*digit*digit);
		}
		
		if(originalNum==sum)
		{
			System.out.println("Number "+originalNum+" is Armstrong");
		}
		else
		{
			System.out.println("Number "+originalNum+" is Not Armstrong");
		}
	}
}