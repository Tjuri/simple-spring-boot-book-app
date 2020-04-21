package com.example.cc01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;

public class BooksManagement {

    ArrayList<Book> books = new ArrayList<Book>();

    public BooksManagement() {
        this.books = new ArrayList<Book>();
        this.fillBooks();
    }

    public void fillBooks() {
        this.books.add(new Book("Herr der Ringe", "Tolkien", "34545"));
        this.books.add(new Book("Clean Code", "Martin", "1234"));
        this.books.add(new Book("Marokko - der Süden", "Buchholz", "32313"));
    }

    public Optional<Book> getByIsdn(String isdn) {
        return this.books
                .stream()
                .filter(book -> book.getIsbn().contains(isdn))
                .findFirst();
    }

    public ArrayList<Book> getByTitle(String title) {

        return this.books
                .stream()
                .filter(book -> book.getTitle().contains(title))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
