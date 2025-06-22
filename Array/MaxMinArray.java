
public class MaxMinArray 
{
	public static void main(String[] args)
	{
		int a[] = {1,9,7,2,4,8},min,max=0;
		min=a[0];
		for(int i=0;i<6;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Maximum Array : "+max);
		System.out.println("Manimum Array : "+min);
	}
}
