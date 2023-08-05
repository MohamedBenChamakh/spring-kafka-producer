package com.example.kafkaproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryEvent{

    Integer libraryEventId;
    LibraryEventType libraryEventType;
    Book book;
}
