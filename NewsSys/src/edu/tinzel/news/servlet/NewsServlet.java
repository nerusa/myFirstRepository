package edu.tinzel.news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.tinzel.news.biz.ClassBiz;
import edu.tinzel.news.biz.NewsBiz;
import edu.tinzel.news.entity.News;


public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String opt = request.getParameter("opt");
		switch (opt){
		case "loadList":
			this.loadList(request, response);
			break;
		case "loadNews":
			this.loadNews(request, response);
			break;
		case "addNews":
			this.addNews(request, response);
			break;
		case "newDetails":
			this.newDetails(request, response);
			break;
		case "updNews":
			this.updNews(request, response);
			break;
		case "delete":
			this.delete(request, response);
			break;
		case "LoginOutSvt":
			this.LoginOutSvt(request, response);
			break;
		}
	}
	
	protected void newDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			//根据id查询全部信息
			request.setAttribute("newss", new NewsBiz().loadNews(id));
			//查询新闻类别绑定下拉列表
			request.setAttribute("clazzList", new ClassBiz().loadClass());
			request.getRequestDispatcher("manager/updnews.jsp").forward(request, response);
		
			
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}

	
	protected void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("list", new NewsBiz().loadList());
			request.getRequestDispatcher("manager/index.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
	protected void LoginOutSvt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("list", new NewsBiz().loadList());
			request.getRequestDispatcher("manager/LoginOutSvt.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
	
	protected void loadNews(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("newss", new NewsBiz().loadNews(id));
			//System.out.println(new NewsBiz().loadNews(id));
			new NewsBiz().updateReadCount(id);
			request.getRequestDispatcher("manager/news.jsp").forward(request, response);
			
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
	
	
	protected void addNews(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String source = request.getParameter("source");
			String content = request.getParameter("content");
			String addDate = request.getParameter("addDate");
			int classId = Integer.parseInt(request.getParameter("classId"));
			new NewsBiz().addNews(new News(classId,title,author,source,content,addDate));
			request.setAttribute("list",new NewsBiz().loadNewsList());
			request.getRequestDispatcher("manager/newsdetails.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}	
	}
	
	protected void updNews(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("n_id"));
			String title = request.getParameter("title");
			String author =request.getParameter("author");
			String source = request.getParameter("source");
			String content = request.getParameter("content");
			String addDate = request.getParameter("addDate");
			int classId = Integer.parseInt(request.getParameter("classId"));
			new NewsBiz().updNews(new News(id,classId,title,author,source,content,addDate));
			request.setAttribute("list", new NewsBiz().loadNewsList());
			request.getRequestDispatcher("manager/newsdetails.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
	
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			new NewsBiz().delete(id);
			request.setAttribute("list", new NewsBiz().loadNewsList());
			request.getRequestDispatcher("manager/newsdetails.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
}
