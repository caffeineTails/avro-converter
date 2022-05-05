package com.avroconverter.service;

import com.avroconverter.models.ModelSchema;
import com.avroconverter.models.Models2;
import com.avroconverter.producer.KafkaAvroProducer;
import com.books.avro.Author;
import com.books.avro.Book;
import com.books.avro.BookShop;
import com.books.avro.Publisher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessService {

    private final KafkaAvroProducer kafkaProducer;

    public ProcessService(KafkaAvroProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void processFile(List<ModelSchema> modelSchemas) {
        for (ModelSchema modelSchema : modelSchemas) {
            try {
                if (modelSchema.getBook() != null) {
                    Book book = Book.newBuilder()
                            .setId(modelSchema.getBook().getId())
                            .setName(modelSchema.getBook().getName())
                            .setGenre(modelSchema.getBook().getGenre())
                            .setAuthor(modelSchema.getBook().getAuthor())
                            .setYear(modelSchema.getBook().getYear())
                            .build();
                    kafkaProducer.handleAndParseObject(book);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
                if (modelSchema.getBookshop() != null) {
                    BookShop bookShop = BookShop.newBuilder()
                            .setId(modelSchema.getBookshop().getId())
                            .setName(modelSchema.getBookshop().getName())
                            .setAddress(modelSchema.getBookshop().getAddress())
                            .setOwner(modelSchema.getBookshop().getOwner())
                            .setPhone(modelSchema.getBookshop().getPhone())
                            .build();
                    kafkaProducer.handleAndParseObject(bookShop);
                }
                if (modelSchema.getAuthor() != null) {
                    Author author = Author.newBuilder()
                            .setId(modelSchema.getAuthor().getId())
                            .setName(modelSchema.getAuthor().getName())
                            .setGenres(modelSchema.getAuthor().getGenres())
                            .setAge(modelSchema.getAuthor().getAge())
                            .setDescription(modelSchema.getAuthor().getDescription())
                            .build();
                    kafkaProducer.handleAndParseObject(author);
                }

                if (modelSchema.getPublisher() != null) {
                    Publisher publisher = Publisher.newBuilder()
                            .setId(modelSchema.getPublisher().getId())
                            .setName(modelSchema.getPublisher().getName())
                            .setAddress(modelSchema.getPublisher().getAddress())
                            .build();
                    kafkaProducer.handleAndParseObject(publisher);
                }


        }
    }

    public void processArray(List<Models2> models2s) {
        for (Models2 modelSchema : models2s) {
            try {
                if (modelSchema.getBook() != null && !modelSchema.getBook().isEmpty()) {
                    modelSchema.getBook().stream().map(book ->
                            Book.newBuilder()
                                    .setId(book.getId())
                                    .setName(book.getName())
                                    .setGenre(book.getGenre())
                                    .setAuthor(book.getAuthor())
                                    .setYear(book.getYear())
                                    .build()).forEach(kafkaProducer::handleAndParseObject);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            try {
                if (modelSchema.getAuthor() != null && !modelSchema.getAuthor().isEmpty()) {
                    modelSchema.getAuthor().stream().map(author ->
                            Author.newBuilder()
                                    .setId(author.getId())
                                    .setName(author.getName())
                                    .setGenres(author.getGenres())
                                    .setAge(author.getAge())
                                    .setDescription(author.getDescription())
                                    .build()).forEach(kafkaProducer::handleAndParseObject);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            try {
                if (modelSchema.getBookshop() != null && !modelSchema.getBookshop().isEmpty()) {
                    modelSchema.getBookshop().stream().map(bookshop ->
                            BookShop.newBuilder()
                                    .setId(bookshop.getId())
                                    .setName(bookshop.getName())
                                    .setAddress(bookshop.getAddress())
                                    .setOwner(bookshop.getOwner())
                                    .setPhone(bookshop.getPhone())
                                    .build()).forEach(kafkaProducer::handleAndParseObject);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            try {
                if (modelSchema.getPublisher() != null && !modelSchema.getPublisher().isEmpty()) {
                    modelSchema.getPublisher().stream().map(publisher ->
                            Publisher.newBuilder()
                                    .setId(publisher.getId())
                                    .setName(publisher.getName())
                                    .setAddress(publisher.getAddress())
                                    .build()).forEach(kafkaProducer::handleAndParseObject);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
