package com.example.james.treeslisthomework;

/**
 * Created by james on 05/07/2017.
 */

public class Tree {

    private String name;
    private int ageInYears;
    private String countryOfOrigin;

    public Tree(String name, String countryOfOrigin, int ageInYears){
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.ageInYears = ageInYears;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getAgeInYears() {
        return ageInYears;
    }
}
