package edu.lessons.day8.exceptions;

import java.util.Scanner;

public class DemoA {
public static void m4()
{
	System.out.println("Before Try");
	int x=0,y=0,z=0;
	String s1=null,s2=null;
	java.util.Scanner sc=null;
	try
	{
		sc=new Scanner(System.in);
		System.out.println("Inside Try");
		System.out.println("Enter value for X");
		s1=sc.nextLine();
		System.out.println("Enter value for Y");
		s2=sc.nextLine();
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x/y;
		System.out.println("Result "+z);
	}
catch(ArithmeticException err)
	{
	System.out.println("Inside Catch1 "+err.getMessage());
	System.out.println("Error Type "+err.getClass().getName());
	}
	catch(NumberFormatException err)
	{
		System.out.println("Inside Catch2 "+err.getMessage());
		System.out.println("Error Type "+err.getClass().getName());
	}
	catch(Exception err)
	{
		System.out.println("Inside Catch3 "+err.getMessage());
		System.out.println("Error Type "+err.getClass().getName());
	}
	finally
	{
		System.out.println("Inside Finally");
	}
}
}
