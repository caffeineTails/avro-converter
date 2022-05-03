package com.avroconverter.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
public class ModelSchema {

    @JsonProperty(value = "author")
    private Author author;

    @JsonProperty(value = "book")
    private Book book;

    @JsonProperty(value = "bookshop")
    private Bookshop bookshop;

    @JsonProperty(value = "publisher")
    private Publisher publisher;
}
