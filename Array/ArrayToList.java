import java.util.ArrayList;
import java.util.List;

public class ArrayToList 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			list.add(arr[i]);
		}
		System.out.println(list);
	}
}