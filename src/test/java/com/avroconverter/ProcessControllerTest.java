package com.avroconverter;

import com.avroconverter.controller.ProcessController;
import com.avroconverter.models.*;
import com.avroconverter.producer.KafkaAvroProducer;
import com.avroconverter.service.ProcessService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest
public class ProcessControllerTest {

    List<ModelSchema> modelSchemaList = new ArrayList<>();
    List<Models2> models2List = new ArrayList<>();

    {
        List<Author> authors = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Bookshop> bookshops = new ArrayList<>();
        List<Publisher> publishers = new ArrayList<>();

        List<CharSequence> genresList = new ArrayList<>();
        Random random = new Random();
        int randomNumber = random.ints(1000, 2000).findFirst().orElse(1000);
        genresList.add("sci-fi");

        for (int i = 2; i <= randomNumber; i++) {

            if (i % 2 == 0) {
                modelSchemaList.add(new ModelSchema(
                        null,
                        new Book(i, "bookName", "genre", "author", 100),
                        null,
                        null
                ));
                books.add(new Book(i, "bookName", "genre", "author", 100));
            }

            if (i % 7 == 0) {
                modelSchemaList.add(new ModelSchema(
                        new Author(i, "name", genresList, 100, "desc"),
                        null,
                        null,
                        null
                ));
                authors.add(new Author(i, "name", genresList, 100, "desc"));
            }

            if (i % 10 == 0) {
                modelSchemaList.add(new ModelSchema(
                        null,
                        null,
                        new Bookshop(i + 2, "shopName", "address", "owner", "1111"),
                        null
                ));
                bookshops.add(new Bookshop(i + 2, "shopName", "address", "owner", "1111"));
            }

            if (i % 15 == 0) {
                modelSchemaList.add(new ModelSchema(
                        null,
                        null,
                        null,
                        new Publisher(i + 3, "publisherName", "publisherAddress")
                ));
                publishers.add(new Publisher(i + 3, "publisherName", "publisherAddress"));
            }

            if (i % 50 == 0) {
                modelSchemaList.add(new ModelSchema(
                        new Author(i, "name", genresList, 100, "desc"),
                        new Book(i + 1, "bookName", "genre", "author", 100),
                        null,
                        null

                ));
            }

            if (i % 75 == 0) {
                modelSchemaList.add(new ModelSchema(
                        new Author(i, "name", genresList, 100, "desc"),
                        new Book(i + 1, "bookName", "genre", "author", 100),
                        new Bookshop(i + 2, "shopName", "address", "owner", "1111"),
                        null
                ));
            }
        }
        models2List.add(new Models2(authors, books, bookshops, publishers));
    }

    @Test
    void consumeTest() {
        KafkaAvroProducer kafkaAvroProducer = new KafkaAvroProducer();
        ProcessService processService = new ProcessService(kafkaAvroProducer);
        ProcessController processController = new ProcessController(processService);
        processController.processList(modelSchemaList);
    }

    @Test
    void conTest() {
        KafkaAvroProducer kafkaAvroProducer = new KafkaAvroProducer();
        ProcessService processService = new ProcessService(kafkaAvroProducer);
        ProcessController processController = new ProcessController(processService);
        processController.conLists(models2List);
    }
}
