public class SmallElementInArray
{
	public static void main(String args[])
	{
		int []arr =new int[] {8,1,9,7,6};
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Element in present array : " +min);
	}
}
