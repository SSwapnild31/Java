package dbconnection.dbconnectionexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblemp1")
public class Employee 
{
	@Id
	@Column(name="id")
    private int id;
	@Column(name="name")
    private String name;
	@Column(name ="city")
    private String city;
	@Column(name ="salary")
    private float salary;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    public Employee(int id, String name, String city, float salary) 
    {
    	this.id=id;
    	this.name=name;
    	this.city=city;
    	this.salary=salary;
    }
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getCity() 
    {
    	return city;
	}
    public void setCity(String city)
    {
    	this.city=city;
    }
    public float getSalary()
    {
    	return salary;
    }
    public void setSalary(float salary)
    {
    	this.salary=salary;
    }
    
	@Override    
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
}
