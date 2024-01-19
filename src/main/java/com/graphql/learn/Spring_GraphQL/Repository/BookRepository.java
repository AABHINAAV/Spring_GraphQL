package com.graphql.learn.Spring_GraphQL.Repository;

import com.graphql.learn.Spring_GraphQL.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
