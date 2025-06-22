import java.util.*;

public class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5],i;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter "+(i+1)+" Array : ");
			a[i]=sc.nextInt();
		}
		System.out.print("Reverse Array :");
		for(i=4;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
	}
}