import java.util.*;

public class ArrayTest 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int a[ ] = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.print("Enter Array value :-");
			a[i]=sc.nextInt();
		}
		System.out.print("Array Elements are :- ");
		for(i=0;i<5;i++)
		{
			System.out.print(" " +a[i]);
		}
	}
}
