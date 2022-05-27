package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


import com.chainsys.minproject.dao.AppointmentDao;
import com.chainsys.minproject.pojo.Appointment;

public class TestAppointmentDao {
	public static void testGetAllAppointment() {
		List<Appointment> allAppointment =AppointmentDao.getAllAppointment();
		Iterator<Appointment> appIterator = allAppointment.iterator();
		while (appIterator.hasNext()) {
			Appointment app = appIterator.next();
			System.out.println(app.getApp_id() + " " + app.getPatient_name() +" "+app.getDoc_id());
		}
	}

	public static void testGetAppointmentById() {
		Appointment app =AppointmentDao.getAppointmentById(102);
		System.out.println(app.getApp_id() + " " + app.getPatient_name() +" "+app.getDoc_id());	
		}

	public static void testInsertAppointment() {
		Appointment newapp = new Appointment();
		newapp.setApp_id(11);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newapp.setApp_date(newDate);
		newapp.setDoc_id(4);
		newapp.setPatient_name("Velmurugan");
		newapp.setFees_collected(500);
		int result = AppointmentDao.insertAppointment(newapp);
		System.out.println(result);
	}

	public static void testUpdateAppointment() {
		Appointment oldapp = AppointmentDao.getAppointmentById(11);
		System.out.println(oldapp.getApp_id() + " " + oldapp.getPatient_name() +" "+oldapp.getDoc_id());			
		oldapp.setApp_id(11);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldapp.setApp_date(newDate);
		oldapp.setDoc_id(4);
		oldapp.setPatient_name("Sheik");
		oldapp.setFees_collected(500);
		int result = AppointmentDao.updateAppointment(oldapp);
		System.out.println(result);
	}

	public static void testDeleteAppointment() {
		int result = AppointmentDao.deleteAppointment(11);
		System.out.println(result);
	}

}
