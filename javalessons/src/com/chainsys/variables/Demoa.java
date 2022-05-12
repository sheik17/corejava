package com.chainsys.variables;

public class Demoa {
     public static int DataA;//static global variable
     public final int DataB;//immutable global variable (not static)
     public final static int DataC=300;//constant
     private int DataD;
     //constructor
     /*
      * constructor is a special method
      * The name of the constructor and the name of the class will bwe same
      * constructor don't have return type
      */
     public Demoa(int dataB)
     {
    	 /*assigning value to the global read-only field (this.DataB)*/
    	 this.DataB=dataB;
     }
     /*static method can be called without an object
      * */
     public static void sayHello()
     {
    	 System.out.println("Hello Developer!!!");
     }
     public void greetUser()
     {
    	System.out.println("Greetings USER!!!");
     }
	
}
