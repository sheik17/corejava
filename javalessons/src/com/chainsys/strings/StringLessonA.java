package com.chainsys.strings;

import java.util.Iterator;

public class StringLessonA {
	public static void lessonOne() {
		String firstString ="Chainsys";
		System.out.println(firstString);
		char dataOne[]= {'C','h','a','i','n'};
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString =new String(new char[] {'C','h','a','i','n'});
		System.out.println(thirdString);
	}
	public static void lessonTwo()
	{
		String firstString = "Hello";
		String secondString ="Hello";
		String thirdString="Hello";
		int firstNumber =100;
		int secondNumber=100;
		int thirdNumber=100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString="welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}
public static void creatingStringInaForLoop()
{
	for(int count=0;count<10;count++)
	{
		String s1="Hello";
	}
}
public static void stringToCharArray()
{
	java.util.Scanner scanner=new java.util.Scanner(System.in);
	System.out.println("Enter a WORD");
	String firstString=scanner.nextLine();
	scanner.close();
	int stringlength=firstString.length();
	System.out.println("Length "+stringlength);
	char[] data=firstString.toCharArray();
	int dataarraylength=data.length;
	System.out.println("Length "+dataarraylength);
}
public static void stringToUpperLower()
{
	java.util.Scanner scanner=new java.util.Scanner(System.in);
	System.out.println("Enter a WORD");
	String firstString=scanner.nextLine();
	scanner.close();
	System.out.println(firstString);
	String stringInUppercase=firstString.toUpperCase();
	System.out.println("toppercase="+stringInUppercase);
	System.out.println("s1="+firstString);
	String stringInLowercase=firstString.toLowerCase();
    System.out.println("toLowercase="+stringInLowercase);
    System.out.println("s1="+firstString);
    String substring=firstString.substring(3);
    System.out.println(substring);
    substring=firstString.substring(2,6);
    System.out.println(substring);
    String replacedstring=firstString.replace('a','e');
    System.out.println(replacedstring);
    boolean flag1=firstString.equals(stringInUppercase);
    System.out.println(flag1);
    boolean flag=firstString.equalsIgnoreCase(stringInUppercase);
    System.out.println(flag);
    
}
public static void testStringTrim()
{
	String secondString="    Hope      it       rain           ";
	System.out.println("Before Trim: "+secondString.length());
	secondString=secondString.trim();
	System.out.println("After Trim: "+secondString.length());
}
public static void testSplit()
{
	String firstString="  Tom and Jerry are good friends   ";
	String trimmedString=firstString.trim();
	String[] data=trimmedString.split(" ");
	int count=data.length;
	System.out.println("Word count "+count);
	for (int index = 0; index < count; index++) 
	{
		System.out.println(data[index]);
	}
}
	public static void testSplitDays()
	{
		String weekdays="Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		String [] data=weekdays.split(";");
		int count=data.length;
		System.out.println("Day count "+count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
}
}
	public static void reverse()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence="";
		try
		{
			sentence=scanner.nextLine();
		}
        finally
        {
        	scanner.close();
        }
		char[] reverseString=sentence.toCharArray();
		int Stringlength=reverseString.length;
		for(int index=Stringlength-1;index>=0;index--)
		{
			System.out.print(reverseString[index]);
		}
	}
	public static void verifyString(String s1)
	{
		if(null==s1)
		{
			System.out.print("String is Null");
			
		}
		else
		{
			System.out.println("String is NOT Null "+s1);
			
		}
		if(!s1.isEmpty())
		{
			System.out.println("\t Not Empty "+s1);
		}
		else
		{
			System.out.println("\t String is Empty");
		}
	}
	
}