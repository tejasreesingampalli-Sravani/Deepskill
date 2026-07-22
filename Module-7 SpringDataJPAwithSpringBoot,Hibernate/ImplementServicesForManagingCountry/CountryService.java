package com.cognizant.countryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    // Find Country by Code
    public Country findCountryByCode(String code) {
        return repository.findById(code).orElse(null);
    }

    // Add Country
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    // Update Country
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    // Delete Country
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    // Search by Partial Name
    public List<Country> searchCountries(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}