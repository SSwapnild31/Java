import java.util.*;

public class ArraySort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5],i,j;
		System.out.print("Enter Unsorted Array Elements...\n\n");
		for(i=0;i<5;i++)
		{
			System.out.print("Enter "+(i+1)+" Array ~> ");
			a[i]=sc.nextInt();
		}
		System.out.print("\nSorted array elements : ");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
