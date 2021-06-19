package pl.coderslab.controller;

import pl.coderslab.Model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();
    void add(Book book);
    Optional<Book> get(Long id);
    //void set(Long id);
}
