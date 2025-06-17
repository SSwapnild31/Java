package codes;

import java.util.*;

class Multiply
{
	public static void main(String args[])
	{
			Scanner Sc = new Scanner(System.in);
			int num;
			System.out.print("Enter an Number-> ");
			num = Sc.nextInt();
			if(num%3==0 && num%5==0)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
	}
}
