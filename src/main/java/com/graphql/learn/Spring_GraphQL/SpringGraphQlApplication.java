package com.graphql.learn.Spring_GraphQL;

import com.graphql.learn.Spring_GraphQL.Entities.Book;
import com.graphql.learn.Spring_GraphQL.Service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringGraphQlApplication implements CommandLineRunner {

    @Value("${server.port}")
    private String port;

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphQlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Server running at {}", port);

        int len = this.bookService.getAllBooks().size();
        if (len == 0) {
            Book book1 = Book.builder()
                    .booktitle("Book 1")
                    .bookauthor("Author 1")
                    .bookdescription("Description 1")
                    .bookpages(208)
                    .bookprice(250)
                    .build();

            Book book2 = Book.builder()
                    .booktitle("Book 2")
                    .bookauthor("Author 2")
                    .bookdescription("Description 2")
                    .bookpages(208)
                    .bookprice(250)
                    .build();

            Book book3 = Book.builder()
                    .booktitle("Book 3")
                    .bookauthor("Author 3")
                    .bookdescription("Description 3")
                    .bookpages(208)
                    .bookprice(250)
                    .build();

            this.bookService.createBook(book1);
            this.bookService.createBook(book2);
            this.bookService.createBook(book3);
        }
    }
}
