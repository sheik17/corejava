package com.chainsys.test;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value 5 to 10:");
		int x=sc.nextInt();
		sc.close();
        int sum=2*x*x+x+5;
        System.out.println(sum);
	}

}
