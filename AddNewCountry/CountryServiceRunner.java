

package com.cognizant.countryservice;

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
    public void run(String... args) {

        System.out.println("===== ADD COUNTRY TEST =====");

        Country newCountry = new Country("ZZ", "Zedland");

        countryService.addCountry(newCountry);

        try {
            Country country =
                    countryService.findCountryByCode("ZZ");

            System.out.println(country);

        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}