package com.graphql.learn.Spring_GraphQL.Service.implementations;

import com.graphql.learn.Spring_GraphQL.Entities.Book;
import com.graphql.learn.Spring_GraphQL.Repository.BookRepository;
import com.graphql.learn.Spring_GraphQL.Service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getBookById(Integer bookid) {
        return this.bookRepository.findById(bookid).orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
