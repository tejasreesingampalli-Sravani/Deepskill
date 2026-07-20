package com.cognizant.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "country_code")
    private String code;

    @Column(name = "country_name")
    private String name;

    @OneToMany(mappedBy = "country",
            fetch = FetchType.LAZY)
    private List<State> states;

    public Country() {
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

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}