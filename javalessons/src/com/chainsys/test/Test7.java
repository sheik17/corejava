package com.chainsys.test;
import java.util.Scanner;
public class Test7 {
	
	public static void main(String[] args) {
		System.out.println("enter name");
       Scanner sc= new Scanner(System.in);
       String name=sc.nextLine();
       sc.close();
       char[] nameString=name.toCharArray();
       int stringLen=nameString.length;
       int n=8;
       if(n>stringLen)
       {
    	 System.out.println("type the character more than 8");  
       }
       else 
       {
       for(int index=0;index<stringLen;index++)
       {
    	  
    	   if( (nameString[index] >= 'a' && nameString[index]  <= 'z') || (nameString[index]  >= 'A' && nameString[index]  <= 'Z'))
    	   {
           System.out.println(" Is an alphabet.");
           break;
    	   }
          else
           {
           System.out.println(" Is not an alphabet.");
           break;
       }
     
       }
    		   
	}
	}
}


