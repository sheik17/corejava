package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
public class Calculatortest {
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Add(arg1,arg2);
		System.out.println("Result of Add is :"+output);				
	}
	public static void testMultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Multiply(arg1,arg2);
		System.out.println("Result of Multiply is :"+output);	
	}
	public static void testDivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Divide(arg1,arg2);
		System.out.println("Result of Divide is :"+output);	
	}
	public static void testSubtraction()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Subtraction(arg1,arg2);
		System.out.println("Result of Subtraction is :"+output);	
	}
	public static void testModules()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Modules(arg1,arg2);
		System.out.println("Result of Modules is :"+output);	
	}

}
