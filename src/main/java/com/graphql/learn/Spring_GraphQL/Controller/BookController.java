package com.graphql.learn.Spring_GraphQL.Controller;

import com.graphql.learn.Spring_GraphQL.Entities.Book;
import com.graphql.learn.Spring_GraphQL.Entities.GraphQL_Inputs.BookInput;
import com.graphql.learn.Spring_GraphQL.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    // create book
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput bookInput) {
        Book book = Book.builder()
                .booktitle(bookInput.getBooktitle())
                .bookauthor(bookInput.getBookauthor())
                .bookdescription(bookInput.getBookdescription())
                .bookpages(bookInput.getBookpages())
                .bookprice(bookInput.getBookprice())
                .build();
        System.out.println(book.toString());
        return book;
//        return this.bookService.createBook(book);
    }

    // get all books
    @QueryMapping("getAllBooks")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    // get book by id
    @QueryMapping("getBookById")
    public Book getBookById(@Argument Integer bookId) {
        return this.bookService.getBookById(bookId);
    }
}
