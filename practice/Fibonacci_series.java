package codes;
import java.util.*;

public class Fibonacci_series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,i=1,res=0;
		System.out.print("Enter Number -> ");
		num = sc.nextInt();
		while(i<=num)
		{
			res=res+i;
			System.out.println("Fibonacci No["+i+"]->"+res);
			i++;
		}
		System.out.print("Total of Fibonacci Number upto "+num+" -> "+res);
	}
}//Not Solved 