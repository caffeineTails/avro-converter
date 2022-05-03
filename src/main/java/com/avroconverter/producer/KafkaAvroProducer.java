package com.avroconverter.producer;

import com.books.avro.Author;
import com.books.avro.Book;
import com.books.avro.BookShop;
import com.books.avro.Publisher;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class KafkaAvroProducer {

    final String BOOK_TOPIC = "bookTopic";
    final String BOOKSHOP_TOPIC = "bookShopTopic";
    final String AUTHOR_TOPIC = "authorTopic";
    final String PUBLISHER_TOPIC = "publisherTopic";
    final String PRODUCER_SERVER_URL = "localhost:9092";
    final String SCHEMA_REGISTRY_URL = "http://localhost:8081";

    KafkaProducer<String, Book> bookProducer;
    KafkaProducer<String, BookShop> bookShopProducer;
    KafkaProducer<String, Author> authorProducer;
    KafkaProducer<String, Publisher> publisherProducer;
    Properties properties;
    {
        properties = new Properties();

        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, PRODUCER_SERVER_URL);
        properties.setProperty(ProducerConfig.ACKS_CONFIG, "1");
        properties.setProperty(ProducerConfig.RETRIES_CONFIG, "10");

        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());

        properties.setProperty(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);
    }

    public void handleAndParseObject(Book book) {
        bookProducer = new KafkaProducer<>(properties);

        bookProducer.send(new ProducerRecord<>(BOOK_TOPIC, book));
        bookProducer.flush();
        bookProducer.close();
    }

    public void handleAndParseObject(BookShop bookShop) {
        bookShopProducer = new KafkaProducer<>(properties);

        bookShopProducer.send(new ProducerRecord<>(BOOKSHOP_TOPIC, bookShop));
        bookShopProducer.flush();
        bookShopProducer.close();
    }

    public void handleAndParseObject(Author author) {
        authorProducer = new KafkaProducer<>(properties);

        authorProducer.send(new ProducerRecord<>(AUTHOR_TOPIC, author));
        authorProducer.flush();
        authorProducer.close();
    }

    public void handleAndParseObject(Publisher publisher) {
        publisherProducer = new KafkaProducer<>(properties);

        publisherProducer.send(new ProducerRecord<>(PUBLISHER_TOPIC, publisher));
        publisherProducer.flush();
        publisherProducer.close();
    }
}
