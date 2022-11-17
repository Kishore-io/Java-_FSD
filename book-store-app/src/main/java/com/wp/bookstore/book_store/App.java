package com.wp.bookstore.book_store;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.wp.bookstore.book_store.model.Book;
import com.wp.bookstore.book_store.repository.BookRepository;
import com.wp.bookstore.book_store.repository.BookRepositoryImpl;
import com.wp.bookstore.book_store.service.BookService;
import com.wp.bookstore.book_store.service.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookService service = new BookServiceImpl();
        
        //Inserting a book into db
        Book book = new Book("Data Structures", "Sandeep Jain", 550.90F, LocalDate.of(2020, 9, 02));
        
        try {
			service.saveBook(book);
			System.out.println("Book Saved Successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        
        //Getting a book by title
        
//        try {
//			Book book = service.getBookByTitle("Java Programming");
//			System.out.println(book);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        
        //Getting all the books from book_db
        
        try {
			List<Book> list = service.getAllBooks();
			Iterator<Book> itr =  list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        //Deleting a book by title
//        try {
//			boolean deleted = service.deleteBook("Python Programming");
//			if(deleted) {
//				System.out.println("Book deleted successfully");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        
        //Update a book
        
//        try {
//			Book book = service.getBookByTitle("Java Programming");
//			service.updateBook(book);
//			System.out.println("Updated successfully");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//    }
}
}

