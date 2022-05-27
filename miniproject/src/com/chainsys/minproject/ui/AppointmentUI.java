package com.chainsys.minproject.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.minproject.commonutil.InvalidInputDataException;
import com.chainsys.minproject.commonutil.Validator;
import com.chainsys.minproject.dao.*;
import com.chainsys.minproject.pojo.*;

public class AppointmentUI {
	
	public static void addNewAppointments() {

		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		
		System.out.println("Enter the Appointment id:");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int apId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(apId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();	
		}
		app.setApp_id(apId);
		System.out.println("Enter  hire_date like \"dd/mm/yyyy\":");
		SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
		String emp_HireDate = sc.nextLine();
		// Date hire_date=hire_dateFormate.parse(emp_HireDate);

		try {
			Validator.checkDateFormat(emp_HireDate);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		Date newDate = null;
		try {
			newDate = hire_dateFormate.parse(emp_HireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			Validator.CheckNofutureDate(newDate);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setApp_date(newDate);
		System.out.println("Enter Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParse(doc_id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			
		}
		int apId1 = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(apId1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			
		}
		app.setDoc_id(Integer.parseInt(doc_id));		
		System.out.println("Enter patient Name:");
		String name = sc.nextLine();
		try {
			Validator.checkStringOnly(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			
		}
		app.setPatient_name(name);
		System.out.println("Enter fees collected:");
		float fees = sc.nextFloat();
		try {
			Validator.checkfee(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			
		}
		app.setFees_collected(fees);
		int result = AppointmentDao.insertAppointment(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void updateAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int apId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(apId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setApp_id(apId);

			System.out.println("Enter  hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newap.setApp_date(newDate);
			System.out.println("Enter Update Doctor_Id :");
			String id1 = sc.nextLine();
			try {
				Validator.checkStringForParse(id1);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id1);
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setDoc_id(docId);
			System.out.println("Enter Update Patient Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setPatient_name(name);
			System.out.println("Enter Update Fees Collected :");
			float fees = sc.nextFloat();
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setFees_collected(fees);
			int result = AppointmentDao.updateAppointment(newap);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void deleteAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int apId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(apId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setApp_id(apId);
			int result = AppointmentDao.deleteAppointment(Integer.parseInt(id));
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void getAppointmentById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int apId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(apId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setApp_id(apId);
			Appointment result = AppointmentDao.getAppointmentById(Integer.parseInt(id));
			System.out.println(result.getApp_id() + " " + result.getApp_date() + " " + result.getDoc_id() + " "
					+ result.getPatient_name() + " " + result.getFees_collected());
		} finally {
			sc.close();
		}
	}

	public static void getAllAppointmentDetails() {
		List<Appointment> allAppointments = AppointmentDao.getAllAppointment();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			System.out.println(ap.getApp_id() + " " + ap.getApp_date() + " " + ap.getDoc_id() + " "
					+ ap.getPatient_name() + " " + ap.getFees_collected());
		}
	}

}