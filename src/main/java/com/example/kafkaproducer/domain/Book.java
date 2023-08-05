package com.example.kafkaproducer.domain;

public record Book(
        Integer bookId,
        String bookName,
        String bookAuthor
) {
}
