package com.chainsys.Sethash;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String>arraydeque=new ArrayDeque<String>();
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("E");
		arraydeque.push("F");
		System.out.println("Before Popping the Stack: "+arraydeque.size());
		while(arraydeque.peek() != null)
		{
			System.out.println(arraydeque.pop()+" ");	
		}
		System.out.println("After Popping the Stack: "+arraydeque.size());
		

	}

}
