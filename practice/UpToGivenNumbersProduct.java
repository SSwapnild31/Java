package codes;
import java.util.*;

public class UpToGivenNumbersProduct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,res=0;
		System.out.print("Enter an Number->");
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			res=i*i;
			System.out.println(i+"->"+res);
		}
	}
}
