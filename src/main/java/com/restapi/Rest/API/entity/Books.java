package com.restapi.Rest.API.entity;

public class Books {

	private String title;
	private int id;
	private String author;
	
	public Books(String title, int id, String author) {
		super();
		this.title = title;
		this.id = id;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [title=" + title + ", id=" + id + ", author=" + author + "]";
	}

	public Books() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
