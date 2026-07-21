package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.model.Country;

public interface CountryRepository extends JpaRepository<Country,String> {

    // HQL Query
    @Query("FROM Country")
    List<Country> getAllCountries();

    // HQL with condition
    @Query("FROM Country c WHERE c.name=?1")
    Country findCountryByName(String name);

    // Aggregate Function
    @Query("SELECT COUNT(c) FROM Country c")
    long countCountries();

    // Native Query
    @Query(value="SELECT * FROM country", nativeQuery=true)
    List<Country> getAllCountriesNative();
}