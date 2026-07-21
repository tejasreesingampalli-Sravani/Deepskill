package com.cognizant.countryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.countryservice.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
List<Country> findByNameContainingIgnoreCase(String name);
    // Search country name containing text
    List<Country> findByNameContaining(String name);

    // Countries starting with given letter
    List<Country> findByNameStartingWith(String letter);

    // Sort countries by name ascending
    List<Country> findByOrderByNameAsc();

    // Get first 3 countries alphabetically
    List<Country> findTop3ByOrderByNameAsc();

    // Previous queries if your runner uses them
    List<Country> findAllByOrderByNameAsc();

    List<Country> findByCreatedDateBetween(
            java.time.LocalDate startDate,
            java.time.LocalDate endDate);

    List<Country> findByPopulationGreaterThan(int population);

    List<Country> findByPopulationLessThan(int population);

    List<Country> findTop3ByOrderByPopulationDesc();

}