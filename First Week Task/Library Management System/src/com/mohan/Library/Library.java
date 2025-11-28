package com.mohan.Library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mohan.BookModel.Book;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(String title, String author) {
        LocalDate today = LocalDate.now();
        Book newBook = new Book(title, author, true, today);
        books.add(newBook);
        System.out.println("Book was added successfully.");
    }

    // Remove Book
    public void removeBook(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Book was successfully removed from the library.");
                return;
            }
        }

        System.out.println("Book not found in the library.");
    }

    //  Search book by title
    public void searchBook_byTitle(String title) {

        List<Book> results = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No book found with title: " + title);
        } else {
            System.out.println("Search results:");
            for (Book b : results) {
                System.out.println(b);
            }
        }
    }

    // Search book by author
    public void searchBook_byAuthor(String author) {

        List<Book> results = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                results.add(book);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No book found by author: " + author);
        } else {
            System.out.println("Search results:");
            for (Book b : results) {
                System.out.println(b);
            }
        }
    }

    // Display Books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books are available in the library.");
        } else {
            System.out.println("Available books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Collect a book
    public void collectingBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have successfully collected the book.");
                } else {
                    System.out.println("Sorry, this book is already collected by someone.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    // Return a book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have successfully returned the book.");
                } else {
                    System.out.println("This book was not collected.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
}
