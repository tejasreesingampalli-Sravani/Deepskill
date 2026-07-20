
package com.cognizant.countryservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;
import com.cognizant.countryservice.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    @Transactional
    public Country findCountryByCode(String countryCode)
            throws CountryNotFoundException {

        Optional<Country> result =
                repository.findById(countryCode);

        if (!result.isPresent()) {
            throw new CountryNotFoundException(
                    "Country not found: " + countryCode);
        }

        return result.get();
    }

    public Country addCountry(Country country) {
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    public List<Country> searchCountries(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}