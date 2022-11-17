package com.wp.bookstore.book_store.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wp.bookstore.book_store.model.Book;

public class BookRepositoryImpl implements BookRepository {
	
	
	Connection conn;
	PreparedStatement stmt;
	String url="jdbc:mysql://localhost:3306/book_store_app";
	String username = "root";
	String password = "Kishore@1998";
 	public BookRepositoryImpl() {
 		try {
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection gets Successful");
 		}catch(Exception e) {
 			System.out.println(e.getMessage());
 		}
	}

	@Override
	public Book saveBook(Book book) throws SQLException {
		stmt = conn.prepareStatement("insert into book_db values(?,?,?,?)");
		stmt.setString(1,book.getTitle());
		stmt.setString(2, book.getAuthor());
		stmt.setFloat(3, book.getPrice());
		String dateString = book.getDatePublished().
								format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
		
		stmt.setString(4, dateString);
		
		int rowCount = stmt.executeUpdate();
		if(rowCount>0) {
			return book;
		}
		return null;
	}

	@Override
	public Book getBookByTitle(String title) throws SQLException {
		stmt = conn.prepareStatement("select * from book_db where title=?");
		stmt.setString(1, title);
		ResultSet queryResult = stmt.executeQuery();
		Book book = null;
		if(queryResult.next()) {
			String bookTitle = queryResult.getString("title");
			String authorName = queryResult.getString("author");
			float bookPrice   = queryResult.getFloat("price");
			String dateString = queryResult.getString("datePublished");
			LocalDate datePublished = LocalDate.parse(dateString);
			
			book = new Book(bookTitle, authorName, bookPrice, datePublished);
		}
		return book;
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
		List<Book> list = new ArrayList<Book>();
		stmt = conn.prepareStatement("select * from book_db");
		ResultSet queryResult = stmt.executeQuery();
		Book book= null;
		while(queryResult.next()) {
			String bookTitle = queryResult.getString("title");
			String authorName = queryResult.getString("author");
			float bookPrice   = queryResult.getFloat("price");
			String dateString = queryResult.getString("datePublished");
			LocalDate datePublished = LocalDate.parse(dateString);
			book = new Book(bookTitle, authorName, bookPrice, datePublished);
			list.add(book);
		}
		return list;
	}

	@Override
	public boolean deleteBook(String title) throws SQLException {
		stmt = conn.prepareStatement("delete from book_db where title=?");
		stmt.setString(1, title);
		int resultCount = stmt.executeUpdate();
		if(resultCount>0)
			return true;
		return false;
	}

	@Override
	public Book updateBook(Book book) throws SQLException {
		stmt = conn.prepareStatement("update book_db set title=? where title=?");
		stmt.setString(1, "Java Programming");
		stmt.setString(2, "Spring Boot");
		int resultCount = stmt.executeUpdate();
		if(resultCount>0) {
			return book;
		}
		return book;
	}

	@Override
	public Book getBookById(long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBook(long id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
