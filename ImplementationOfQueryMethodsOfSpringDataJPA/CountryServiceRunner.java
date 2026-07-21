package com.cognizant.countryservice;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;


@Component
public class CountryServiceRunner implements CommandLineRunner {


    private CountryRepository repository;


    public CountryServiceRunner(CountryRepository repository) {
        this.repository = repository;
    }



    @Override
    public void run(String... args) throws Exception {


        System.out.println("===== ADD COUNTRY TEST =====");


        repository.save(new Country("IN","India"));
        repository.save(new Country("US","United States"));
        repository.save(new Country("UK","United Kingdom"));
        repository.save(new Country("AU","Australia"));
        repository.save(new Country("CA","Canada"));
        repository.save(new Country("ZZ","Zedland"));



        System.out.println("\n===== SEARCH CONTAINING TEXT =====");

        repository.findByNameContaining("United")
                .forEach(System.out::println);



        System.out.println("\n===== SORTING =====");

        repository.findByOrderByNameAsc()
                .forEach(System.out::println);



        System.out.println("\n===== STARTING WITH =====");

        repository.findByNameStartingWith("A")
                .forEach(System.out::println);



        System.out.println("\n===== TOP 3 COUNTRIES =====");

        repository.findTop3ByOrderByNameAsc()
                .forEach(System.out::println);



    }

}