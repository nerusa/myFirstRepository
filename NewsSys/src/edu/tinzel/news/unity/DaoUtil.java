package edu.tinzel.news.unity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoUtil {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databasename=TinzelNews";
	private static final String UID = "sa";
	private static final String PWD = "123";

	/**
	 * 
	 * 
	 * @return
	 * @throws Exceptionf
	 */
	public Connection getCon() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, UID, PWD);
	}

	/**
	 * 
	 * @param con
	 * @param stat
	 * @param rset
	 * @throws Exception
	 */
	public void closeCon(Connection con, PreparedStatement ps, ResultSet rs)
			throws Exception {
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		if (con != null) {
			con.close();
		}
		rs = null;
		ps = null;
		con = null;
	}


}
