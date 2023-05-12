package vij;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root",
				"Vijay@1220");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name='lam'");
		while (rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));

		}
	}

}
