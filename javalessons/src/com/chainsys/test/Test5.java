package com.chainsys.test;

public class Test5 {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=9;i++)
		{
	    for(int k=1;k<=n-i;k++)
	    {
			System.out.print(".");
	    }
			for(int l=i;l>=1;l--)
		{
			System.out.print(l);
		}
		for(int j=2;j<=i;j++)
		{
		System.out.print(j);	
		}
        System.out.println();
		}
		}
		}
