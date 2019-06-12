package edu.tinzel.news.entity;

import java.io.Serializable;

public class Clazz implements Serializable {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + "]";
	}
	public Clazz(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Clazz() {
		super();
	}
	public Clazz(String name) {
		super();
		this.name = name;
	}
	
}
