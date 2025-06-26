public class MoveNegArray 
{
	public static void main(String args[])
	{
		int a[]= {1,-2,3,-4,5,-6},i,neg=0;
		System.out.print("Negative elements from array : ");
		for(i=0;i<6;i++)
		{
			if(a[i]<0)
			{
				neg=a[i];
				System.out.print(neg+", ");
			}
		}
	}
}