package com.example.cc01;

import java.util.ArrayList;
import java.util.Iterator;

public class BooksManagement {

    ArrayList<Book> books = new ArrayList<Book>();

    public BooksManagement() {
        this.books = new ArrayList<Book>();
        this.fillBooks();
    }

    public void fillBooks() {
        this.books.add(new Book("Herr der Ringe", "Tolkien", "34545"));
        this.books.add(new Book("Clean Code", "Martin", "1234"));
        this.books.add(new Book("Marokko - der Süden", "Buchholz", "34545"));
    }

    public Book getByIsdn(String isdn) {
        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.getIsbn() == isdn) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.getTitle() == title) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
