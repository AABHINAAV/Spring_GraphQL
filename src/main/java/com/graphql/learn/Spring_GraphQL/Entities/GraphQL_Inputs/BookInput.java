package com.graphql.learn.Spring_GraphQL.Entities.GraphQL_Inputs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookInput {
    private String booktitle;
    private String bookauthor;
    private String bookdescription;
    private int bookpages;
    private int bookprice;
}