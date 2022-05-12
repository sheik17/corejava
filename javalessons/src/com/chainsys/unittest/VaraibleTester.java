package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

public class VaraibleTester {
	public static void testGlobalVariable()
	{
		System.out.println("DataA:"+Demoa.DataA);
//		System.out.println("DataB:"+Demoa.DataB);
		System.out.println("DataC:"+Demoa.DataC);
		Demoa.DataA=2345;
		System.out.println("DataA:"+Demoa.DataA);
		//Demoa.DataC=2345;
	}
	public static void testImmutableVariable()
	{
		/* cannot make a static reference to the non-static field Demoa.DataB*/
		//Demoa.Datab=123;
		/**
		 * first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		Demoa firstObject=new Demoa(123);
		System.out.println(firstObject.DataB);
		/**
		 * value assigned to an immutable field can not be changed
		 * value for the immutable field can be assigned only through the constructor
		 */
		//firstObject.DataB=567;
	}
    /**
     *Calling static method using class name
     *without creating an object
     *created on : 25 Mar 2022 
     */
	public static void testStaticMethod()
	{
		Demoa.sayHello();
	}
	/**
	 *Calling non-static method using Object reference
	 *without creating an object, non-static methods can not be called
	 *created on : 25 March 2022
	 */
	public static void testNonStaticMethod()
	{
		//Error
		//Demoa.greetUser();
		Demoa firstObject=new Demoa(111);
		//call the non static method
		firstObject.greetUser();
	}
}
