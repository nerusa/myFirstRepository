package edu.tinzel.news.biz;

import java.util.List;

import edu.tinzel.news.dao.ClassDao;
import edu.tinzel.news.entity.Clazz;

public class ClassBiz {
	public List<Clazz> loadClass() throws Exception{
		return new ClassDao().loadClass();
	}
}
