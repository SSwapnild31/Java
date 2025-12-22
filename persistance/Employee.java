package com.google.drive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblemp")
public class Employee 
{
	@Id
	@Column(name="eid")
	private int id;
	@Column(name="ename")
	private String name;
	@Column(name="ecity")
	private String city;
	@Column(name="edept")
	private String dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String city, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", dept=" + dept + "]";
	}
	
}
