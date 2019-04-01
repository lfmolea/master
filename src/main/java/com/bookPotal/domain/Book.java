package com.bookPotal.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	private String author;
	private String publisher;
	private String publicationDate;
	/*
	 * //private int numberOfPages; private String language; private String
	 * category; //private double shippingWeight; private double listPrice; private
	 * double outPrice; private boolean active=true; private int inStockNumber;
	 * 
	 * @Column(columnDefinition="text") private String description;
	 * 
	 * @Transient private MultipartFile bookImage;
	 */
	
	
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	/*
	 * public int getNumberOfPages() { return numberOfPages; } public void
	 * setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }
	 * public String getLanguage() { return language; } public void
	 * setLanguage(String language) { this.language = language; } public String
	 * getCategory() { return category; } public void setCategory(String category) {
	 * this.category = category; } public double getShippingWeight() { return
	 * shippingWeight; } public void setShippingWeight(double shippingWeight) {
	 * this.shippingWeight = shippingWeight; } public double getListPrice() { return
	 * listPrice; } public void setListPrice(double listPrice) { this.listPrice =
	 * listPrice; } public double getOutPrice() { return outPrice; } public void
	 * setOutPrice(double outPrice) { this.outPrice = outPrice; } public boolean
	 * isActive() { return active; } public void setActive(boolean active) {
	 * this.active = active; } public int getInStockNumber() { return inStockNumber;
	 * } public void setInStockNumber(int inStockNumber) { this.inStockNumber =
	 * inStockNumber; } public String getDesciption() { return description; } public
	 * void setDesciption(String desciption) { this.description = desciption; }
	 * public MultipartFile getBookImage() { return bookImage; } public void
	 * setBookImage(MultipartFile bookImage) { this.bookImage = bookImage; }
	 */
	
	
	
}
