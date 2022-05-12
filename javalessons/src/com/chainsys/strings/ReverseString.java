package com.chainsys.strings;

public class ReverseString {
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
	

}
