package com.tata.capital;

import java.io.IOException;
import java.util.Scanner;

import com.tata.capital.interfaces.Create;
import com.tata.capital.interfaces.Delete;
import com.tata.capital.interfaces.Fetch;
import com.tata.capital.interfaces.Update;
import com.tata.capital.service.CreateService;
import com.tata.capital.service.DeleteService;
import com.tata.capital.service.FetchService;
import com.tata.capital.service.UpdateService;


public class Test 
{
	public static void main(String[] args) throws Exception,IOException
	{
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("1.Insert Data \n2.Update Data \n3.Delete Data \n4.Display Data \n5.Exit");
			System.out.print("Enter Your choice -> ");
			int ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
				Create c1=new CreateService();
				c1.create();
				break;
			case 2:
				Update u1=new UpdateService();
				u1.update();
				break;
			case 3:
				Delete d1=new DeleteService();
				d1.delete();
				break;
			case 4:
				Fetch f1=new FetchService();
				f1.read();
				break;
			case 5:
				System.out.println("Exited Succesfully...");
				return ;
			default:
				System.out.println("Wrong choice...!");
				break;
			}
		}
	}
}