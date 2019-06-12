package edu.tinzel.news.biz;


import edu.tinzel.news.dao.UserDao;

public class UserBiz {
	public boolean login(String userName,String passWord) throws Exception{
		return new UserDao().login(userName, passWord);
	}
	
}
