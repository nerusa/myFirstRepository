package edu.tinzel.news.biz;

import java.util.List;

import edu.tinzel.news.dao.NewsDao;
import edu.tinzel.news.entity.News;

public class NewsBiz {
	//查询标题
	public List<News> loadList() throws Exception{
		return new NewsDao().loadList();
	}
	//修改浏览次数
	public int updateReadCount(int id) throws Exception{
		return new NewsDao().updateReadCount(id);
	}
	//根据编号查找新闻
	public News loadNews(int id) throws Exception{
		return new NewsDao().loadNews(id);
	}
	public List<News> loadNewsList() throws Exception{
		return new NewsDao().loadNewsList();
	}
	//添加新闻
	public int addNews(News news) throws Exception{
		return new NewsDao().addNews(news);
	}
	//删除新闻
	public int delete(int id) throws Exception{
		return new NewsDao().delete(id);
	}
	//修改新闻
	public int updNews(News news) throws Exception{
		return new NewsDao().updNews(news);
	}
	//退出
	public List<News> LoginOutSvt() throws Exception{
		return new NewsDao().LoginOutSvt();
	}
}
