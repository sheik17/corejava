package com.chainsys.test;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 digit Number: ");
		int n= sc.nextInt();
		sc.close();
		int input=n;
		int rem,outvalue=0;
        while(n>0)
        {
        	rem=n%10;
        	outvalue=outvalue+rem*rem*rem;
            n=n/10;
        	
        }
        if(outvalue==input)
        {
        	System.out.println(outvalue+ ":Same as input number");
        }
        else
        {
        	System.out.println(outvalue+ ":Different Number");
        }
        
        
        
       
	}

}
