package com.chainsys.classandmethods;
import com.chainsys.classandmethods.*;
public class BankTest {
	public static void test()
	{			
	Branch obj=new Branch(1);		
	System.out.println("Bank Name : "+obj.getBankName());
	System.out.println("Branch Num : "+obj.getId());
	obj.setLocation("Tirunelveli");
	obj.getLocation();
	obj.setManagerId(12);
	obj.getManagerId();
	obj.getId();
	System.out.println("Location : "+obj.getLocation());
	System.out.println("ManagerId : "+obj.getManagerId());		
	Person p=new Person(2);
	p.setName("sheik");
	p.getName();
	p.setAddress("kather meeran street");
	p.getAddress();
	p.setPhone_number(6384138052L);
	p.getPhone_number();
	p.setE_mail_address("Sheikfireeagle@gmail.com");
	p.getE_mail_address();
	System.out.println("Person Id : "+p.getId());
	System.out.println("Person Name : "+p.getName());
	System.out.println("Person Address : "+p.getAddress());
	System.out.println("Person PhoneNumber : "+p.getPhone_number());
	System.out.println("Person Email Id : "+p.getE_mail_address());
	CustomerAccountDetails c=new CustomerAccountDetails(123,345);
	c.setAccount_type("saving");
	c.getAccount_type();
	c.setCurrent_balance(2000);
	c.getAccount_number();
	c.getCurrent_balance();
	System.out.println("Customer Id : "+c.getCustomer_id());
	System.out.println("Customer Account type : "+c.getAccount_type());
	System.out.println("Customer Account Number : "+c.getAccount_number());
	System.out.println("Customer CurrentBalance : "+c.getCurrent_balance());
	}
	}