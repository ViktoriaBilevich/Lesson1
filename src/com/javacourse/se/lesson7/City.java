package com.javacourse.se.lesson7;

import java.util.Objects;

public class City extends AdministrativeTerritorialUnit {

    public City(String name, String capital, double square) {
        super(name, capital, square);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        City city = (City) o;
//        return Double.compare(city.square, square) == 0 && Objects.equals(name, city.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, square);
//    }
}
