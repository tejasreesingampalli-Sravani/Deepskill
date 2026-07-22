package com.cognizant.countryservice;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.service.CountryService;
import com.cognizant.countryservice.service.exception.CountryNotFoundException;

@Component
public class CountryServiceRunner implements CommandLineRunner {

    private final CountryService countryService;

    public CountryServiceRunner(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("===== FIND COUNTRY =====");

        try {
            Country country =
                    countryService.findCountryByCode("IN");

            System.out.println(country);

        } catch (CountryNotFoundException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("===== COUNTRY NOT FOUND TEST =====");

        try {
            Country country =
                    countryService.findCountryByCode("ZZ");

            System.out.println(country);

        } catch (CountryNotFoundException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("===== ADD COUNTRY =====");

        countryService.addCountry(
                new Country("XX", "Test Country"));

        try {
            System.out.println(
                    countryService.findCountryByCode("XX"));
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===== UPDATE COUNTRY =====");

        countryService.updateCountry(
                new Country("XX", "Updated Country"));

        try {
            System.out.println(
                    countryService.findCountryByCode("XX"));
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===== SEARCH COUNTRY =====");

        List<Country> list =
                countryService.searchCountries("ind");

        list.forEach(System.out::println);

        System.out.println("===== DELETE COUNTRY =====");

        countryService.deleteCountry("XX");

        try {
            System.out.println(
                    countryService.findCountryByCode("XX"));
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}