package com.graphql.learn.Spring_GraphQL.GraphQlResolvers;

import com.graphql.learn.Spring_GraphQL.Entities.Book;
import com.graphql.learn.Spring_GraphQL.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver{

    @Autowired
    private BookService bookService;

    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    public Book getBookById(Integer bookid) {
        return this.bookService.getBookById(bookid);
    }
}
