package com.chiansys.thread;

public class CurrentThreadDemo
{
	public static void main(String args[])
	{
		 try
		 {
		   Thread t1=Thread.currentThread();
		   System.out.println("MainThread ID: " +t1.getId() );
		   Worker w=new Worker();
		   WorkerThread e=new  WorkerThread();
		   w.callme();
		  
		   System.out.println("In Main After callme");	
		   e.execute();
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
   	}
}
