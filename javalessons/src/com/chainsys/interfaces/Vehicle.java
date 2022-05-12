package com.chainsys.interfaces;

class Car {
	// defining a method
	void run() {
		System.out.println("Vehicle is moving");
	}
}

// Creating a child class
class Vehicle extends Car {
	// defining the same method as in the parent class
	void run() {
		System.out.println("car is running safely");
	}

	public static void main(String args[]) {
		Car obj = new Car();// creating object
		obj.run();// calling method
	}
}
