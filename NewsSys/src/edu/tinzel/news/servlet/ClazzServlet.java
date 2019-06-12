package edu.tinzel.news.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.tinzel.news.biz.ClassBiz;



public class ClazzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String opt = request.getParameter("opt");
		switch (opt){
		case "loadClass":
			this.loadClass(request, response);
			break;
		}
	}

	protected void loadClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("clazzList", new ClassBiz().loadClass());
			request.getRequestDispatcher("manager/addnews.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "error:"+e.getMessage());
			request.getRequestDispatcher("manager/common/error.jsp").forward(request, response);
		}
	}
}
