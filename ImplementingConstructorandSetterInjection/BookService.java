package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String serviceName;
    private BookRepository repository;

    
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void display() {
        System.out.println("Service Name: " + serviceName);
        repository.showRepository();
    }
}