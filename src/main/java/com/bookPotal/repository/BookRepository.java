
  package com.bookPotal.repository;
  
  
  import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.bookPotal.domain.Book;
  
  public interface BookRepository extends JpaRepository<Book, Long>{
  
  Book findByUsername(String book);

Optional<Book> delete(Long id);
  
  
  
  }
 