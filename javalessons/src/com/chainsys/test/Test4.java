package com.chainsys.test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String Words="Tom and Jerry are good friends";
     String trimString=Words.trim();
	 String[] data=trimString.split(" ");
	 int count=data.length;
	 System.out.println("Word count "+count);
	 char[] letterString=Words.toCharArray();
	 int reverseString=letterString.length;
	 for(int i=reverseString-1;i>=0;i--)
	 {
		System.out.print(letterString[i]); 
	 }
	}

}
