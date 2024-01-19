package com.graphql.learn.Spring_GraphQL.Controller;

import com.graphql.learn.Spring_GraphQL.Entities.Book;
import com.graphql.learn.Spring_GraphQL.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BookController {
    @Autowired
    private BookService bookService;

    // create book
    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return this.bookService.createBook(book);
    }

    // get all books
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    // get book by id
    @GetMapping("/getBookById/{bookid}")
    public Book getBookById(@PathVariable Integer bookid) {
        return this.bookService.getBookById(bookid);
    }
}
