package com.chainsys.interfaces;
	interface add {
		public abstract int add(int v1, int v2);
	}  
	interface multiply {  
		public abstract int multiply(int v1, int v2);
	}  
	interface divide{
		public abstract int divide(int v1, int v2);
	}
	class Calculator implements add,multiply,divide {  
		public int add(int v1, int v2) {
			System.out.println(v1 + v2);
			return v1 + v2;
		}

		public int multiply(int v1, int v2) {
			System.out.println(v1 * v2);
			return v1 * v2;

		}

		public int divide(int v1, int v2) {
			System.out.println(v1 / v2);
			return v1 / v2;
		}
	}
	public class MultiInterface {
	    public static void main(String args[]) {  
	        Calculator c=new Calculator(); 
	        c.add(12, 180);
	        c.divide(10, 2);
	        c.multiply(2, 10);
	    }  
	}

