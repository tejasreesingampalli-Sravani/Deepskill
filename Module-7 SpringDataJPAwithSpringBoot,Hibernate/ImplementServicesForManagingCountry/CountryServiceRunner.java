package com.cognizant.countryservice;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.service.CountryService;

@Component
public class CountryServiceRunner implements CommandLineRunner {

    private final CountryService countryService;

    public CountryServiceRunner(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("===== FIND COUNTRY =====");
        System.out.println(countryService.findCountryByCode("IN"));

        System.out.println("===== ADD COUNTRY =====");
        countryService.addCountry(new Country("XX", "Test Country"));
        System.out.println(countryService.findCountryByCode("XX"));

        System.out.println("===== UPDATE COUNTRY =====");
        countryService.updateCountry(new Country("XX", "Updated Country"));
        System.out.println(countryService.findCountryByCode("XX"));

        System.out.println("===== SEARCH COUNTRY =====");

        List<Country> list =
                countryService.searchCountries("ind");

        list.forEach(System.out::println);

        System.out.println("===== DELETE COUNTRY =====");

        countryService.deleteCountry("XX");

        System.out.println(
                countryService.findCountryByCode("XX"));
    }
}