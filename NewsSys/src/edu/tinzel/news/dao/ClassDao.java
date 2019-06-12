package edu.tinzel.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.tinzel.news.entity.Clazz;
import edu.tinzel.news.unity.DaoUtil;

public class ClassDao extends DaoUtil{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//查询新闻类型
	public List<Clazz> loadClass() throws Exception{
		String sql = "select * from Clazz";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.rs=this.ps.executeQuery();
		List<Clazz> list = new ArrayList<Clazz>();
		while(this.rs.next()){
			Clazz c = new Clazz(this.rs.getInt("id"),this.rs.getString("name"));
			list.add(c);
		}
		super.closeCon(con, ps, rs);
		return list;
	} 
}
