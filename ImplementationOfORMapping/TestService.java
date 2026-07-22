package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.repository.CountryRepository;

@Component
public class TestService implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Countries:");

        countryRepository.findAll()
                .forEach(System.out::println);
    }
}