package com.chainsys.minproject.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.chainsys.minproject.pojo.*;
import java.sql.PreparedStatement;
public class DoctorDao {

	private static Connection getConnection() {
		String drivername = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "123";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private static java.sql.Date convertTosqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}

	public static int insertDoctor(Doctor newdoc) {
		String insertquery = "insert into doctor(DOC_ID,DOC_NAME,DOB,SPECIALITY,CITY,PHONE_NO,FEES) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
//		int rows ;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newdoc.getDOC_ID());
			ps.setString(2, newdoc.getDOC_NAME());
			// convert java.util.Date to java.sql.date
			ps.setDate(3, convertTosqlDate(newdoc.getDOB()));
			ps.setString(4, newdoc.getSPECIALITY());
			ps.setString(5, newdoc.getCITY());
			ps.setString(6, newdoc.getPHONE_NO());
			ps.setFloat(7, newdoc.getFEES());

			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int updateDoctor(Doctor newdoc) {
		String updatequery = "update doctor set DOC_NAME=?,DOB=?,SPECIALITY=?,CITY=?,PHONE_NO=?,FEES=? where Doc_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7, newdoc.getDOC_ID());
			ps.setString(1, newdoc.getDOC_NAME());
			// convert java.util.Date to java.sql.date
			ps.setDate(2, convertTosqlDate(newdoc.getDOB()));
			ps.setString(3, newdoc.getSPECIALITY());
			ps.setString(4, newdoc.getCITY());
			ps.setString(5, newdoc.getPHONE_NO());
			ps.setFloat(6, newdoc.getFEES());
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	// to update only one column of the table
	public static int updateDoctorFirstName(int id, String docname) {
		String updatequery = "update doctor set DOC_NAME=? where DOC_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, docname);
			ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public static int updateDoctorSalary(int id, float fees) {
		String updatequery = "update doctor set fees=? where doc_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setDouble(1, fees);
			ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int deleteDoctor(int id) {
		String deletequery = "delete from doctor where DOC_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static Doctor getDoctorById(int id) {
		Doctor doc = null;
		String selectquery = "select  DOC_ID,DOC_NAME,DOB,SPECIALITY,CITY,PHONE_NO,FEES from doctor where doc_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			doc = new Doctor();
			if (rs.next()) {
			
				doc.setDOC_ID(rs.getInt(1));
				doc.setDOC_NAME(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDOB(date);
				doc.setSPECIALITY(rs.getString(4));
				doc.setCITY(rs.getString(5));
				doc.setPHONE_NO(rs.getString(6));
				doc.setFEES(rs.getFloat(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;

	}

	public static List<Doctor> getAllDoctor() {
		List<Doctor> listOfDoctor = new ArrayList<Doctor>();
		Doctor doc;
		String selectquery = "select  DOC_ID,DOC_NAME,DOB,SPECIALITY,CITY,PHONE_NO,FEES from doctor";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
           
			while (rs.next()) {
				doc = new Doctor();
				doc.setDOC_ID(rs.getInt(1));
				doc.setDOC_NAME(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDOB(date);
				doc.setSPECIALITY(rs.getString(4));
				doc.setCITY(rs.getString(5));
				doc.setPHONE_NO(rs.getString(6));
				doc.setFEES(rs.getFloat(7));
				listOfDoctor.add(doc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfDoctor;
	}

}
