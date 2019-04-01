package com.bookPotal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookPotal.domain.Book;
import com.bookPotal.service.BookService;



@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public String addBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);

		return "addBook";
	}

	@RequestMapping(value="/addBook", method=RequestMethod.POST) public String
	  addBookPost(@ModelAttribute("book")Book book, HttpServletRequest request) {
	  
	  bookService.save(book);
	return"redirect:bookList";
	}

	@RequestMapping("/bookInfor") public String bookInfor(@RequestParam("id")Long
	  id,Model model) { Book book = bookService.findOne(id);
	  model.addAttribute("book", book);
	  
	  return "bookInfor"; }

	@RequestMapping(value="/updateBook", method=RequestMethod.POST) public String
	  updateBookPost(@ModelAttribute("book")Book book, HttpServletRequest request)
	  {
	  
	  bookService.save(book);
	  	  
	  return "redirect:/book/bookInfor?id="+ book.getId(); }

	@RequestMapping("/updateBook") public String
	  updateBook(@RequestParam("id")Long id,Model model) { Book book =
	  bookService.findOne(id); model.addAttribute("book", book);
	  
	  return "updateBook"; }

	@RequestMapping("/bookList") public String bookList(Model model) {
	  List<Book>bookList = bookService.findAll(); 
	  
	  model.addAttribute("bookList", bookList); 
	  return "bookList"; }

}
