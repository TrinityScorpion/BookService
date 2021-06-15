package pl.coderslab.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.Model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    MockBookService mockBookService = new MockBookService();

    @GetMapping
    public List bookList() {

        List<Book> list = mockBookService.getList();
        return list;
    }
    @GetMapping("/{id}")
    public Book bookRead(@PathVariable int id) {
        List<Book> list = mockBookService.getList();
        return list.get(id);
    }

    @PostMapping
    public List formBook() {

        List<Book> list = mockBookService.getList();
        return list;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {




        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

}

