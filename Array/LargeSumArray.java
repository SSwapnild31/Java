public class LargeSumArray 
{
	public static void main(String args[])
	{
		int a[]={1,4,8,3,5},i,j,sum=0;
		System.out.print("Largest sum of two elements : ");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]>sum)
				{
					if(sum<a[i]+a[j])
					{
						sum=a[i]+a[j];
					}
				}
			}
		}
		System.out.print(sum+" ");
	}
}