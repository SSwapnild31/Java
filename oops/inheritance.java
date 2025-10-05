class Parent
{
	String name;
}
class inheritance extends Parent
{
	String name;
	public void display()
	{
		super.name="Parent";
		this.name="Child";
		
		System.out.println(super.name+" and "+this.name);
	}

public static void main(String[] args)
{
	inheritance obj=new inheritance();
	obj.display();
}
}