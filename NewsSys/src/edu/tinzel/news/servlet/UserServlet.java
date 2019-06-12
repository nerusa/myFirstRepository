package edu.tinzel.news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.tinzel.news.biz.NewsBiz;
import edu.tinzel.news.biz.UserBiz;


public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String opt = request.getParameter("opt");
		switch (opt){
		case "login":
			this.login(request, response);
			break;
		}
	}

	
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			boolean bo = new UserBiz().login(userName, passWord);
			if(bo){
				request.getSession().setAttribute("userName", userName);
				//System.out.println(new NewsBiz().loadNewsList()+"======");
				request.setAttribute("list", new NewsBiz().loadNewsList());
				request.getRequestDispatcher("manager/newsdetails.jsp").forward(request, response);
				
			}else{
				request.setAttribute("msg", "账号密码不匹配，登录失败");
				request.getRequestDispatcher("manager/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
	
	
}
