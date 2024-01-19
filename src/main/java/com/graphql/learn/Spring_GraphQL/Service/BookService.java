package com.graphql.learn.Spring_GraphQL.Service;

import com.graphql.learn.Spring_GraphQL.Entities.Book;

import java.util.List;

public interface BookService {
    public Book createBook(Book book);
    public List<Book> getAllBooks();
    public Book getBookById(Integer bookid);
}
