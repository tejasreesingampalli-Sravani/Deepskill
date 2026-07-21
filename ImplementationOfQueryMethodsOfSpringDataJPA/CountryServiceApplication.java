package com.cognizant.countryservice;


import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class CountryServiceApplication implements CommandLineRunner {


    private final CountryRepository repository;


    public CountryServiceApplication(CountryRepository repository){
        this.repository = repository;
    }



    public static void main(String[] args) {

        SpringApplication.run(CountryServiceApplication.class,args);

    }



    @Override
    public void run(String... args) {


        repository.save(
                new Country(
                        "IND",
                        "India",
                        1400000000,
                        LocalDate.now()
                )
        );


        repository.save(
                new Country(
                        "USA",
                        "United States",
                        331000000,
                        LocalDate.now()
                )
        );


        repository.save(
                new Country(
                        "JPN",
                        "Japan",
                        125000000,
                        LocalDate.now()
                )
        );


        repository.save(
                new Country(
                        "AUS",
                        "Australia",
                        26000000,
                        LocalDate.now()
                )
        );


        System.out.println("Countries inserted successfully");


        System.out.println("All Countries:");

        repository.findAll()
                .forEach(System.out::println);


        System.out.println("Countries sorted by name:");

        repository.findAllByOrderByNameAsc()
                .forEach(System.out::println);


        System.out.println("Population > 100 million:");

        repository.findByPopulationGreaterThan(100000000)
                .forEach(System.out::println);


        System.out.println("Top 3 populated countries:");

        repository.findTop3ByOrderByPopulationDesc()
                .forEach(System.out::println);


    }

}