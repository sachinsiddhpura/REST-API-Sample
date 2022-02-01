package com.restapi.Rest.API.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restapi.Rest.API.entity.Books;

@Service
public class BookService {
	Books books = null;
	private static List<Books> list = new ArrayList<>();
	
	static {
		list.add(new Books("JAVA",1,"ABC"));
		list.add(new Books("PYTHON",2,"XYZ"));
		list.add(new Books("JAVASCRIPTS",3,"DKJ"));
	}
	
	public List<Books> getBooks()
	{
		return list;
	}
	
	public Books getBookById(int id)
	{
		Books b = list.stream().filter(x ->x.getId()==id).findFirst().get();
		return b;
	}
	
	public Books insertBook(Books b)
	{
		list.add(b);
		return b;
	}
	
	public Books updateBook(Books book,int id)
	{
		list = list.stream().map(b->{
			if(b.getId()==id)
			{
				b.setAuthor(book.getAuthor());
				b.setTitle(book.getTitle());
			}
			books = b;
			return b;
		}).collect(Collectors.toList());
		return books;
	}
	
	public Books deleteBook(int id)
	{
		Books books = list.stream().filter(x->x.getId()==id).findFirst().get();
		list.remove(books);
		return books;
	}
}
