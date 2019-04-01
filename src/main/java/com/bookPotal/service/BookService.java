
  package com.bookPotal.service;
  
  import java.util.List;
  
  import org.springframework.stereotype.Service;
  
  import com.bookPotal.domain.Book;
  
  @Service
  public interface BookService { Book save(Book book);
  
  List<Book> findAll();
  
  Book findOne(Long id); 

  void removeOne(Long id);
  
  }
