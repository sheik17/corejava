package com.chainsys.reflection;

public class Emp
{
  protected int Eno;
   public String Name;
   private int no;
   private void EmpA()
   {
      System.out.println("Emp Created");
   }
   public void startWork()
   {
      System.out.println("WorkStarted");
	}
	public void pauseWork(int duration)
	{
		System.out.println("pauseWork for "+duration );
	}
}