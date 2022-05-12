package com.chainsys.entrypoint;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String firstObject="Hello";
      System.out.println(firstObject.hashCode());
      System.out.println(firstObject.toString());
      System.out.println(firstObject.getClass().getName());
      String secondObject="Tom and Jerry";
      System.out.println(secondObject.hashCode());
      boolean flag=firstObject.equals(secondObject);
      System.out.println("Equals: "+flag);
	}

}
