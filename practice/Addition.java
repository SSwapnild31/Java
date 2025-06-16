
//find the sum of all numbers from 1 to given number.

package codes;
import java.util.*;

class Addition
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int num,sum=0;
		System.out.print("Enter an Number -> ");
		num = Sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		System.out.println("Addition of 1 To "+num+" is -> "+sum);
	}
}
