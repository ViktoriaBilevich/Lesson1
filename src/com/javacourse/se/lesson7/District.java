package com.javacourse.se.lesson7;

public class District extends AdministrativeTerritorialUnit {

    public City[] getCities(){
        City [] cities = new City[super.parts.length];
        for(int i =0; i< super.parts.length; i++){
            cities[i] = (City)super.parts[i];
        }
        return cities;
    }

    public void setCities(City[] cities){

        this.parts = cities;
    }

    public District(String name, String capital, double square) {
        super(name, capital, square);
    }
    public District(String name, String capital, double square, City[] cities) {
        super(name, capital, square, cities);
        this.parts = cities;
    }
}
