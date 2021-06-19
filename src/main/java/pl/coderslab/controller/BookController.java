package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.coderslab.Model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    @ResponseBody
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Book get(@PathVariable Long id) {
        return  this.bookService.get(id).orElseThrow(() ->{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "nie ma takeigo numeru"
            );
        });
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book){
        System.out.println("Flag2");
        bookService.add(book);
        System.out.println("Flag3");
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

}

