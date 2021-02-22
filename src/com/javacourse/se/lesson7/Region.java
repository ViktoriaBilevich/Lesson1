package com.javacourse.se.lesson7;

public class Region extends AdministrativeTerritorialUnit {

    public District[] getDistricts(){
        District [] districts = new District[super.parts.length];
        for(int i =0; i< super.parts.length; i++){
            districts[i] = (District)super.parts[i];
        }
        return districts;
    }
    public void setDistricts(District[] districts){
        AdministrativeTerritorialUnit ad = new Region("gsd", "fgs", 66);
        this.parts = districts;
    }

    public Region(String name, String capital, double square) {
        super(name, capital, square);
    }

    public Region(String name, String capital, double square, District[] districts) {
        super(name, capital, square, districts);
    }
}
