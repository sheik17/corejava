package com.chainsys.Sethash;

import java.util.HashSet;
import java.util.Iterator;

import com.chainsys.arraylist.Employee;

class SetHashSetDemo {
private static Iterator<String> set_itr;
public static void main(String args[])
{
demoA();	
	//demoB();
}
public static void demoA()
{
	HashSet<String> string_hs=new HashSet<String>();
	string_hs.add("Bee");
	string_hs.add("Apple");
	string_hs.add("Doll");
	string_hs.add(null);
	string_hs.add("Egg");
	string_hs.add("Cinema");
	string_hs.add("Fan");
	System.out.println("Size "+string_hs.size());
	string_hs.add("Fan");
	string_hs.add(null);
	System.out.println("Size "+string_hs.size());
	System.out.println("Size "+string_hs.iterator());
	Iterator<String>set_itr=string_hs.iterator();
	while(set_itr.hasNext())
	{
	System.out.println(set_itr.next()+"-");	
	}
}
public static void demoB()
{
	HashSet<Employee> hs=new HashSet<Employee>();
	Employee e1=null;
	for(int i=0;i<10;i++)
	{
		e1=new Employee(i, null);
		e1.getId();
		e1.Name="Employee "+i;
		hs.add(e1);
	}
	System.out.println("Count "+hs.size());
	e1=new Employee(9, null);
	hs.add(e1);
	System.out.println("Count "+hs.size());
	Iterator<Employee>itr=hs.iterator();
	while(itr.hasNext())
	{
		Employee e2=itr.next();
		System.out.println(e2.getId()+""+e2.Name);
	}
}
}
