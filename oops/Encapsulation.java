
class Employee
{
	private int empId;
	
	public void setId(int eid)
	{
		empId=eid;
	}
	public int getId()
	{
		return empId;
	}
}

class Encapsulation
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setId(102);
		System.out.print(e.getId());
	}
}