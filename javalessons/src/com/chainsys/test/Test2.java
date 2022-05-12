package com.chainsys.test;

public class Test2 {

	public static void main(String[] args) {
		int Num=1546903,Rem;
		while(Num>0)
		{
		Rem=Num%10;
		if(Rem%2==0)
		{
			if(Rem!=0)
			System.out.println(Rem);
		}
		Num=Num/10;
		}
		}
}
	


