package com.mohan.BookModel;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
	
	
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate publicationDate;
    
    
	public Book(String title, String author, boolean isAvailable, LocalDate publicationDate) {
		
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
		this.publicationDate = publicationDate;
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
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, isAvailable, publicationDate, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && isAvailable == other.isAvailable
				&& Objects.equals(publicationDate, other.publicationDate) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + ", publicationDate="
				+ publicationDate + "]";
	}
	
	
    
}
