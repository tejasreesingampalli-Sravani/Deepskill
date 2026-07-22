package com.cognizant.countryservice.service;


import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService {


    private final CountryRepository repository;


    public CountryService(CountryRepository repository){
        this.repository = repository;
    }


    public List<Country> getCountries(){

        return repository.findAll();

    }


    public List<Country> searchCountry(String name){

        return repository.findByNameContainingIgnoreCase(name);

    }


    public Country saveCountry(Country country){

        return repository.save(country);

    }


}