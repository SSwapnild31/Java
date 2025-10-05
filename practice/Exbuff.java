import java.io.*;
class Exbuff
{
	public static void main(String args[])throws IOException
	{
		String nm;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name");
		nm = br.readLine();
		System.out.print("Hello "+nm+" how are you");
	}
}