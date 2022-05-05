package com.avroconverter.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
public class Models2 {
    @JsonProperty(value = "authors")
    private List<Author> author;

    @JsonProperty(value = "books")
    private List<Book> book;

    @JsonProperty(value = "bookShops")
    private List<Bookshop> bookshop;

    @JsonProperty(value = "publishers")
    private List<Publisher> publisher;
}
