package edu.tinzel.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.tinzel.news.unity.DaoUtil;

public class UserDao extends DaoUtil{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	//登录
		public boolean login(String userName,String passWord) throws Exception{
			String sql = "select * from Users where userName=? and passWord=?";
			this.con=super.getCon();
			this.ps=this.con.prepareStatement(sql);
			this.ps.setString(1, userName);
			this.ps.setString(2, passWord);
			this.rs=this.ps.executeQuery();
			boolean bo = false;
			if(this.rs.next()){
				bo = true;
			}
			super.closeCon(con, ps, rs);
			return bo;
		}
		
		
		
}
