package com.chainsys.arraylist;

public class TestEmp {
	public static void main(String[] args)
	{
		Employee firstemp=new Employee(111, null);
		Employee secondemp=new Employee(111, null);
		System.out.println(firstemp.hashCode());
		System.out.println(secondemp.hashCode());
		boolean result=firstemp.equals(secondemp);
		System.out.println(result);
		result=firstemp.equals(firstemp);
		System.out.println(result);
		result=firstemp.equals("Hello");
		System.out.println(result);
	}

}
