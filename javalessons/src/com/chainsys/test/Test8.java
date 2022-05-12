package com.chainsys.test;
import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		System.out.println("Is it raining : type:y");
		Scanner sc=new Scanner(System.in);
		String check=sc.nextLine();	
		sc.close();
		char[] checkInput=check.toCharArray();
		int stringLen=checkInput.length;
		for(int index=0;index<stringLen;index++)
		{
		
		if(checkInput[index]=='y')
		{
			System.out.println("Get the umbrella");
		}
		else
		{
		    System.out.println("Not get the umbrella");
		}
		
		System.out.println("colder than 32 degrees : type:y");
		}
		for(int index1=0;index1<stringLen;index1++)
		{
		if(checkInput[index1]=='y')
		{
			System.out.println("Bring heavy jacket");
		}
		else
		{
		    System.out.println("Not Bring heavy jacket");	
		}
		}
		System.out.println("If the degree 32 to 52 : type:y");
		for(int index2=0;index2<stringLen;index2++)
		{
		if(checkInput[index2]=='y')
		{
			System.out.println("Bring ligth jacket");
		}
		else
		{
		    System.out.println("Not Bring ligth jacket");	
		}
		
		}
}
}