import java.io.*;

public class My 
{
	public static void main(String args[]) throws IOException
	{
		int s, d;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter no for print First-Name :- ");
		s = Integer.parseInt(br.readLine());
		System.out.print("Enter no for print Second-Name :- ");
		d = Integer.parseInt(br.readLine());
		for (int i = 0; i < s; i++)
		{
			System.out.print("First-Name :- ");
			System.out.println(" Swapnil Divate");
		}
		System.out.print("Command Exicuted Times : "+s);
		System.out.println("\n");
		for (int i = 0; i < d; i++)
		{
			System.out.print("Second-Name :- ");
			System.out.println(" Mote Dipak");
		}
		System.out.print("Command Exicuted : "+d);
		System.out.println("\n");
	}	
}