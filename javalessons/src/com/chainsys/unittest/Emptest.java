package com.chainsys.unittest;
import com.chainsys.classmethods.Employee;
public class Emptest {
	public static void testEmployee()
	{
    Employee firstEmployee=new Employee(1234);
    firstEmployee.setName("sheik");
    System.out.println(firstEmployee.getName());
	}
public static void testCity()
{
	  Employee firstEmployee=new Employee(1234);
	    firstEmployee.setCity("chennai");
	    System.out.println(firstEmployee.getCity());
}
public static void testSalary()
{

	    Employee firstEmployee=new Employee(1234);
	    firstEmployee.setSalary(10000);
	    System.out.println(firstEmployee.getSalary());
}
}
