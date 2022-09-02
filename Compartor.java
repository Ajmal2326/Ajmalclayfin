package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compartor 
{
	public static void main(String[] args)
	{
		List<Employee1> emp=new ArrayList<>();
		emp.add(new Employee1("Ajmal", 02, 22000.0));
		emp.add(new Employee1("Akmal", 01, 33000.0));
		emp.add(new Employee1("Syed", 03,  550000.0));
		emp.add(new Employee1("rafu", 05, 3300000.0));
		emp.add(new Employee1("yuhan", 06, 10000000.0));
		emp.add(new Employee1("nabiha", 07, 4500000.0));
		
	
	//	System.out.println(emp);
		Collections.sort(emp, new emp());
		System.out.println(emp);
	}
	
}

class emp implements Comparator<Employee1>
{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else if(o1.getId()<o2.getId())
		{
			return -1;
		}
		else 
			return 0;
	}
	
}
class Employee1
{
	private String name;
	private int id;
	private double salary;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  name + "\t" + id + "\t" + salary + "\t";
	}

	public Employee1(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
}