package com.hibernate.curd.main;

import java.util.List;
import java.util.Scanner;


import com.curd.hybernate.Employee;
import com.hibernate.curd.interfaces.Create;
import com.hibernate.curd.interfaces.Delete;
import com.hibernate.curd.interfaces.Select;
import com.hibernate.curd.interfaces.Update;
import com.hibernate.curd.services.CreateService;
import com.hibernate.curd.services.DeleteService;
import com.hibernate.curd.services.SelectService;
import com.hibernate.curd.services.UpdateService;


public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Create create=new CreateService();
		Delete delete=new DeleteService();
		Select select=new SelectService();
		Update update=new UpdateService();
		while(true)
		{

			System.out.println("------------------------");
			System.out.println(" 1.Create Employee \n 2.Update Employee \n 3.Show Employees \n 4.Delete Employee \n 5.Exit");
			System.out.println("------------------------");
			System.out.print("Enter Your Choice -> ");
			int ch=sc.nextInt();
			System.out.println("------------------------");
	
			switch (ch) 
			{
			case 1:
				System.out.println("Creating user...");
				Employee e1=new Employee();
				System.out.print("Enter Employee Id -> ");
				e1.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter Employee Name -> ");
				e1.setName(sc.next());
				System.out.print("Enter Employee Dept -> ");
				e1.setDept(sc.next());
				System.out.print("Enter Employee City -> ");
				e1.setCity(sc.next());
				System.out.print("Enter Employee Salary -> ");
				e1.setSalary(sc.nextFloat());
				create.create(e1);
				System.out.println("Data inserted...");
				break;
			case 2:
				System.out.println("Updating user...");
				System.out.print("Enter eId for update -> ");
				int updId=sc.nextInt();
				Employee employee=select.select(updId);
				if(employee != null)
				{
					System.out.print("Enter new salary -> ");
					float newSalary=sc.nextFloat();
					employee.setSalary(newSalary);
					update.update(employee);
					System.out.println("Employee updated...");
				}
				else {
					System.out.println("Employee id "+updId+" not found..!");
				}
				break;
			case 3:
			{
				System.out.println("------------------------");
				System.out.println(" 1.Search Employee \n 2.Read all data");
				System.out.println("------------------------");
				System.out.print("Enter Your Choice -> ");
				int key=sc.nextInt();
				System.out.println("------------------------");
				
				switch (key) 
				{
				case 1:
					System.out.print("Enter eId to search ->");
					int sId=sc.nextInt();
					Employee employee1 = select.select(sId);
		            if (employee1 != null) {
		            	System.out.println("------------------------");
		                System.out.println("Employee details of id "+sId+" : \n -> "+employee1);
		                System.out.println("------------------------");
		            } else {
		                System.out.println("Employee " + sId + " not found.");
		            }
					break;
				case 2:
					System.out.println("Featching all data...");
					List<Employee> allEmployees=select.selectall();
					if(!allEmployees.isEmpty()) 
					{
						System.out.println("List of Employees : ");
						System.out.println("------------------------");
						for(Employee e11 : allEmployees)
						{
							System.out.println(e11.getId()+" "+e11.getName()+" "+e11.getDept()+" "+e11.getCity()+" "+e11.getSalary());
						}
						System.out.println("------------------------");
					}
					else {
						System.out.println("No Employees found...");
					}
					
					break;
				default :
					System.out.println("Wrong choice..!");
				}
			}
			break;
			case 4:
				System.out.print("Enter eId to delete -> ");
				int dId=sc.nextInt();
				Employee employee2 = select.select(dId);
				if(employee2 != null)
				{
					System.out.println("Deleting employee...");
					delete.delete(dId);
					System.out.println("Employee deleted...");
				}
				else {
	                System.out.println("Employee id " + dId + " not found.");
	            }
				break;
			case 5:
				System.out.print("Exited successfully...");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice..Enter again");
				break;
			}
		}
	}
}