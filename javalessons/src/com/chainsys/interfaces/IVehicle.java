package com.chainsys.interfaces;

public interface IVehicle 
{
 public final int MAXSPEED=150;
 abstract void echo();
 abstract void start();
 abstract void move();
 abstract void stop();
}
/**
All interface are contract,and markers
*/
//null interface can be only markers,not a contract
interface IPetrol
{
	
}