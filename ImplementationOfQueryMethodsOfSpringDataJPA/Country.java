
package com.cognizant.countryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "country")
public class Country {

    @Id
    private String code;

    private String name;

    private int population;

    private LocalDate createdDate;


    public Country() {
    }


    public Country(String code, String name, int population, LocalDate createdDate) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.createdDate = createdDate;
    }


    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPopulation() {
        return population;
    }


    public void setPopulation(int population) {
        this.population = population;
    }


    public LocalDate getCreatedDate() {
        return createdDate;
    }


    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }


    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", createdDate=" + createdDate +
                '}';
    }
}