package com.chiansys.encapsulation;
import com.chiansys.encapsulation.AbsDemoB;
public class TestAbsDemoA {
	public static void testDemoB() {
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		AbsDemoB objectDemob=new DemoBChild();
		objectDemob.echo();
	}
}
