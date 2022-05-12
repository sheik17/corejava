package com.chainsys.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ListArray {
public static void main(String arg [])
{
	lessonArrayList();	
}
public static void lessonArrayList()
{
	ArrayList<Employee>empArrayList=new ArrayList<Employee>(30);
	System.out.println("InitiempArrayList size of empArrayList: "+empArrayList.size());
	try
	{
		for(int i=0;i<5;i++)
		{
			Employee e1=new Employee(i, null);
			empArrayList.add(e1);
		}
		System.out.println("Size of empArrayList after additions: "+empArrayList.size());
		Employee e3=(Employee)empArrayList.get(4);
		empArrayList.add(e3);
		System.out.println("Size of empArrayList after additions: "+empArrayList.size());
		Employee e4=new Employee(4, null);
		e4.Name="Elon Mark";
		empArrayList.add(e4);
		System.out.println("Freq of [Emp id-4]in ArrayList "+Collections.frequency(empArrayList,e3));
		Iterator<Employee>empIterator=empArrayList.iterator();
		while(empIterator.hasNext())
		{
			Object element =empIterator.next();
			Employee e1=(Employee)element;
			System.out.println("\t"+e1.getId()+" "+e1.Name);
		}
	}catch(Exception err)
	{
		System.out.println("ERROR!"+err.getMessage());
	}
}
}
