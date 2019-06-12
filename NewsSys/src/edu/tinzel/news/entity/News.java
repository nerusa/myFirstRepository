package edu.tinzel.news.entity;

import java.io.Serializable;

public class News implements Serializable {
	private int id;
	private int classId;
	private String title;
	private String author;
	private String source;
	private String content;
	private String addDate; 
	private int readCount;
	
	//类别名
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public News(int id, int classId, String title, String author, String source, String content, String addDate,
			String name) {
		super();
		this.id = id;
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
		this.name = name;
	}

	public News(int id, int classId, String title, String author, String source, String content, String addDate) {
		super();
		this.id = id;
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
	}

	public News(int classId, String title, String author, String source, String content, String addDate) {
		super();
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
	}

	public News(String title, String author, String source, String content, String name,int classId) {
		super();
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.name = name;
		this.classId=classId;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", classId=" + classId + ", title=" + title + ", author=" + author + ", source="
				+ source + ", content=" + content + ", addDate=" + addDate + ", readCount=" + readCount + ", name="
				+ name + "]";
	}

	public News(int id, int classId, String title, String author, String source, String content, String addDate,
			int readCount, String name) {
		super();
		this.id = id;
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
		this.readCount = readCount;
		this.name = name;
	}
	
	public News(int classId, String title, String author, String source, String content, String addDate, String name) {
		super();
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
		this.name = name;
	}


	public News(int classId, String title, String author, String source, String content, String addDate, int readCount,
			String name) {
		super();
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
		this.readCount = readCount;
		this.name = name;
	}

	public News(int id, int classId, String title, String author, String source, String content, String addDate,
			int readCount) {
		super();
		this.id = id;
		this.classId = classId;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
		this.readCount = readCount;
	}

	public News(int id, String title, String author, String source, String content, String addDate,
			int readCount) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.source = source;
		this.content = content;
		this.addDate = addDate;
		this.readCount = readCount;
	}

	public News() {
		super();
	}

	public News(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

}