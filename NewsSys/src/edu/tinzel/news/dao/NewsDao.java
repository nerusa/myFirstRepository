package edu.tinzel.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.tinzel.news.entity.News;
import edu.tinzel.news.unity.DaoUtil;

public class NewsDao extends DaoUtil{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//主页显示全部新闻信息 标题
	public List<News> loadList() throws Exception{
		String sql = "select * from News";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.rs=this.ps.executeQuery();
		List<News> list = new ArrayList<News>();
		while(this.rs.next()){
			list.add(new News(this.rs.getInt("id"),this.rs.getString("title")));
		}
		super.closeCon(con, ps, rs);
		return list;
	}
	//查询全部
	public List<News> loadNewsList() throws Exception{
		String sql = "select * from News";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.rs=this.ps.executeQuery();
		List<News> lists = new ArrayList<News>();
		while(this.rs.next()){
			lists.add(new News(this.rs.getInt("id"),this.rs.getString("title"),this.rs.getString("author"),this.rs.getString("source"),this.rs.getString("content"),this.rs.getString("addDate"),this.rs.getInt("readCount")));
		}
		super.closeCon(con, ps, rs);
		return lists;
	}
	
	
	//修改浏览次数
	public int updateReadCount(int id) throws Exception{
		String sql = "update News set ReadCount+=1 where Id=?";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.ps.setInt(1, id);
		int i = this.ps.executeUpdate();
		super.closeCon(con, ps, null);
		return i;
	}
	
	
	//查看新闻详细信息
	
	public News loadNews(int  id) throws Exception{
		String sql = "SELECT n.id,n.ClassId,n.Title,n.Author,n.Source,n.Content,n.AddDate,n.ReadCount,c.name FROM Clazz c,News n WHERE c.id=n.ClassId and n.Id=?";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.ps.setInt(1, id);
		this.rs=this.ps.executeQuery();
		News n = null;
		if(this.rs.next()){
			n = new News(this.rs.getInt("id"),this.rs.getInt("classId"),this.rs.getString("title"),this.rs.getString("author"),this.rs.getString("source"),this.rs.getString("content"),this.rs.getString("addDate"),this.rs.getInt("readCount"),this.rs.getString("name"));
		}
		super.closeCon(con, ps, rs);
		return n;
	}
	

	//添加新闻
	public int addNews(News news) throws Exception{
		String sql ="INSERT INTO News(title,author,source,content,addDate,readCount,classId) VALUES(?,?,?,?,?,0,?)";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.ps.setString(1, news.getTitle());
		this.ps.setString(2, news.getAuthor());
		this.ps.setString(3, news.getSource());
		this.ps.setString(4, news.getContent());
		this.ps.setString(5, news.getAddDate());
		this.ps.setInt(6, news.getClassId());
		int i = this.ps.executeUpdate();
		super.closeCon(con, ps, null);
		return i;
	}
	//根据编号修改信息信息
	public int updNews(News news) throws Exception{
		String sql = "update News set classId=?,title=?,author=?,source=?,content=?,addDate=? where id=?";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.ps.setInt(1, news.getClassId());
		this.ps.setString(2, news.getTitle());
		this.ps.setString(3, news.getAuthor());
		this.ps.setString(4, news.getSource());
		this.ps.setString(5, news.getContent());
		this.ps.setString(6, news.getAddDate());
		this.ps.setInt(7, news.getId());
		int i = this.ps.executeUpdate();
		super.closeCon(con, ps, null);
		return i;
	}
	
	//根据编号删除新闻信息
	public int delete(int id) throws Exception{
		String sql = "delete from News where id=?";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.ps.setInt(1, id);
		int i = this.ps.executeUpdate();
		super.closeCon(con, ps, null);
		return i;
	}
	
	//退出
	public List<News> LoginOutSvt() throws Exception{
		String sql = "select * from News";
		this.con=super.getCon();
		this.ps=this.con.prepareStatement(sql);
		this.rs=this.ps.executeQuery();
		List<News> list = new ArrayList<News>();
		while(this.rs.next()){
			list.add(new News(this.rs.getInt("id"),this.rs.getString("title")));
		}
		super.closeCon(con, ps, rs);
		return list;
	}
}
