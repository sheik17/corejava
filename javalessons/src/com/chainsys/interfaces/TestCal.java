package com.chainsys.interfaces;

import com.chainsys.interfaces.*;

class TestCal {
	public static void main(String[] args) {
	/**	ICalculatorB cal = new ICalculatorB();

		cal.add(100, 5);
		cal.multiply(20, 50);
		cal.divide(1500, 15);

	}**/

		ICalculatorB firstCalculator=new ICalculatorB();
		if(firstCalculator instanceof ICalculator)
		{
			ICalculator contract=firstCalculator;
			int output=0;
			output=contract.add(10,5);
			System.out.println(output);
			output=contract.multiply(10,5);
			System.out.println(output);
			output=contract.divide(10,5);
			System.out.println(output);
		}
		else
			System.out.println(firstCalculator.getClass().getName()+"does not Implement ICalculator");
	
}
}