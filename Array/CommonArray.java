import java.util.*;
public class CommonArray
{
	public static void main(String[] args)
	{
		String[] array1= {"python","java","html","php","c++","c"};
		String[] array2= {"mysql","sql","sqllite","oracle","c","java"};
		System.out.println("Array1 : "+Arrays.toString(array1));
		System.out.println("Array2 : "+Arrays.toString(array2));
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;i++)
			{
				if(array1[i].equals(array2[j]))
				{
					set.add(array1[i]);
				}
			}
		}
		System.out.println("Common Element : "+(set));
	}
}
