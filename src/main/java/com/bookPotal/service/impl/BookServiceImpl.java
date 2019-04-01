
  package com.bookPotal.service.impl;
  
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.stereotype.Service;

import com.bookPotal.domain.Book;
import  com.bookPotal.repository.BookRepository;
import  com.bookPotal.service.BookService;
  
  @Service 
  public class BookServiceImpl implements BookService {
  
  @Autowired 
  private BookRepository bookRepository;
  
  public Book save(Book book) {
	  
	  return bookRepository.save(book); 
	  
  }
  
  
  public List<Book> findAll(){
	  
	  return (List<Book>) bookRepository.findAll(); 
	  
  }
  
  public Book findOne(Long id){ 
	  
	  return bookRepository.findById(id).get(); 
	  
  }
  public void removeOne(Long id) {
		bookRepository.delete(id).get();
  
  }
  
  }
 