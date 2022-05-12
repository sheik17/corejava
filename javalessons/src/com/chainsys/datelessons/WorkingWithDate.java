package com.chainsys.datelessons;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;
public class WorkingWithDate {
      public static void displayCurrentDate()
      {
    	  Calendar vCalendar=Calendar.getInstance();
    	  Date date=vCalendar.getTime();
    	  System.out.println(date);
    	  SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
    	  System.out.println(dateformat.format(date));
      }
      public static void displayDOB()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter Your DOB:(yyyy-MM-dd) ");
    	  String dobString=sc.nextLine();
    	  sc.close();
    	  int year= Integer.parseInt(dobString.substring(0,4));
    	  int month =Integer.parseInt(dobString.substring(5,7));
    	  int day=Integer.parseInt(dobString.substring(8,10));
    	  System.out.println(year+"-"+month+"-"+day);
    	  
    	  Calendar date=new GregorianCalendar(year,month,day);
    	  Date d1=date.getTime();
    	  SimpleDateFormat f1=new SimpleDateFormat("yyyy-MM-dd");
    	  System.out.println("DOB "+f1.format(d1));
    	  //Retirement date
    	  date.add(Calendar.YEAR,60);
    	  date.add(Calendar.MONTH,1);
    	  date.set(Calendar.DAY_OF_MONTH,1);
    	  date.add(Calendar.DATE,-1);
    	  System.out.println("DOB "+f1.format(date.getTime()));
    	  
    	  }
}
