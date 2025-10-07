
public class MaxOfArray
{
	public static void main(String[] args)
	{
		int i,max=0;
		int a[]= {10,50,20,60,30};
		for(i=0;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print("Maximum : "+max);
	}

}