package com.wp.bookstore.book_store.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.wp.bookstore.book_store.model.Book;

public class BookRepositoryJpaImpl implements BookRepository{

	EntityManagerFactory emfactory;
	EntityManager emgr;
	EntityTransaction tx;
	
	public BookRepositoryJpaImpl() {
		emfactory = Persistence.createEntityManagerFactory("book-persistence");
		emgr = emfactory.createEntityManager();
		tx = emgr.getTransaction();
	}	
	
	@Override
	public Book saveBook(Book book) throws SQLException {
		tx.begin();
		emgr.persist(book);
		tx.commit();
		return book;
	}

	@Override
	public Book getBookByTitle(String title) throws SQLException {
		
		Query query = emgr.createQuery("from Book where title=:title");
		query.setParameter("title", title);
		return (Book) query.getSingleResult();
		
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
//		Query query = emgr.createQuery("from Book");
		TypedQuery<Book> query = emgr.createQuery("from Book", Book.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteBook(String title) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	@Override
	public Book updateBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		tx.begin();
		Book updatedBook = emgr.merge(book);
		tx.commit();
		return updatedBook;
	}

	@Override
	public Book getBookById(long id) throws SQLException {
		return emgr.find(Book.class, id);
	}

	@Override
	public boolean deleteBook(long id) throws SQLException {
		Book book = emgr.find(Book.class, id);
		if(book!=null) {
			tx.begin();
			emgr.remove(book);
			tx.commit();
			return true;
		}
		return false;
	}
	
	
}
