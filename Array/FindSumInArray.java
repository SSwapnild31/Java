
//program to calculate a sum from entered array 
//calculate addition of two array elements or (combination) which addition is sum=entered_value. 

import java.util.Scanner;

public class FindSumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5],i,j,sum,n=0;
		j=a[0];
		System.out.println("-----ENTER ARRAY VALUES-----\n");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element -> ");
			a[i]=sc.nextInt();
		}
		System.out.print("\nEnter sum value : ");
		sum=sc.nextInt();
		System.out.println("Available combinations are given...\n");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					if(a[i]+a[j]==sum)
					{
						n=a[i]+a[j];
						System.out.println((a[i]+" + "+a[j])+" -> "+sum);
					}		
				}
			}
		}
		if(n!=sum)
		{
			System.out.print("That values or combination is not avaible whos sum is -> "+sum);
		}
	}
}