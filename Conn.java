package electricity.billing.system;

import java.sql.*;


public class Conn {
	private static Connection conn=null;
	public static Connection connection() {
	//Connection c=null;
	//Statement s;
	/*Conn(){
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root", "Ashu@2228");
			s = c.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Ashu@2228");
		Statement stmt=conn.createStatement();
	}
	catch(Exception e){
		e.printStackTrace();
	}
		return conn;
	}

}
