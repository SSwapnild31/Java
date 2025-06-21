import java.util.*;

public class DupliateArray 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int i,j;
		System.out.print("Enter array elements : ");
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		System.out.print("Duplicate array elements are :");
		for(i=0;i<a.length;i++)
		{
			
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" "+a[j]);
				}
			}
		}
	}
}