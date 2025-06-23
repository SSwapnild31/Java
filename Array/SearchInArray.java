import java.util.*;

public class SearchInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5],num,val,i;
		val=a[0];
		System.out.println("----Enter array values----\n");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element ->");
			a[i]=sc.nextInt();
		}
		System.out.print("\nEnter element you want to search : ");
		num=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				val=a[i];
				System.out.println("\nElement is present At position ~> "+i+1);
				break;
			}
		}
		if(num!=val)
		{
			System.out.println("\nElement is not present");
		}
	}
}