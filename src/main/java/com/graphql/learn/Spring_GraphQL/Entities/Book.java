package com.graphql.learn.Spring_GraphQL.Entities;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
@Data // getter, setter, toSting, equals, hashCode, RequiredArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
    private String booktitle;
    private String bookauthor;
    private String bookdescription;
    private int bookpages;
    private int bookprice;
}
