package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.domain.LibraryEvent;
import com.example.kafkaproducer.producer.LibraryEventProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @Autowired
    LibraryEventProducer libraryEventProducer;

    @PostMapping("/send")
    public ResponseEntity<?> postLibraryEvent(@RequestBody  LibraryEvent libraryEvent) throws JsonProcessingException {
        libraryEventProducer.sendLibraryEvent(libraryEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }
}
