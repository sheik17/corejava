package edu.lessons.day8.exceptions;

import java.util.Scanner;

public class NestedTry {
	static String[] data;
	public static void main(String args[])
	{
		try {
			m4();
		} catch (Exception e) {
			System.out.println("Inside Catch "+e.getMessage());
			Throwable t1=e.getCause();
			System.out.println("Cause "+t1.getMessage());
		}
	
		/*int num=0;
		int numValue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter value for X");
				data[0]=sc.nextLine();
				numValue=Integer.parseInt(data[4]);
				System.out.println("The square is "+numValue * numValue);
			}
			catch(NumberFormatException nb)
			{
				System.out.println("Not a number! ");
			}
			num=data.length;
			System.out.println("Array Length "+num);
		}catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayIndexOutOfBounds- No arguments given!!!");
		}
		catch(Exception er)
		{
			System.out.println("Exception "+er.getMessage());
		}
	}*/
	}
	
		public static void m4() throws Exception
		{
			Exception e1=new Exception("Error 1");
			//Inner Exception
			//e1 is nested inside e2
			Exception e2=new Exception("Error 2",e1);
			throw e2;
		}
	
		

}
