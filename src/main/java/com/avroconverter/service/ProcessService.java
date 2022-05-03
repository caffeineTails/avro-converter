package com.avroconverter.service;

import com.avroconverter.models.ModelSchema;
import com.avroconverter.producer.KafkaAvroProducer;
import com.books.avro.Author;
import com.books.avro.Book;
import com.books.avro.BookShop;
import com.books.avro.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessService {

    private final KafkaAvroProducer kafkaProducer;

    public ProcessService(KafkaAvroProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void processFile(List<ModelSchema> modelSchemas) {
        for (ModelSchema modelSchema : modelSchemas) {
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
}
