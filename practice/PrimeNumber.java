package codes;
import java.util.*;

public class PrimeNumber
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			int num;
			System.out.print("Enter an Number-> ");
			num = sc.nextInt();
			if(num==0)
			{
				System.out.println("Zero can't be Prime or Not");
			}
			else if(num%1==0 && num%num==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is Odd");
			}
		}
	}

}
