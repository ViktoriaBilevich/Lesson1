package com.javacourse.se.lesson7;
// Аргументировать принадлежность классу каждого создаваемого
//         метода и корректно переопределить для каждого класса методы equals(),
//         hashCode(), toString(). Создать объект класса Государство, используя классы Область, Район,
//         Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class State extends AdministrativeTerritorialUnit {

    public Region[] getRegions(){
        Region [] regions = new Region[super.parts.length];
        for(int i =0; i< super.parts.length; i++){
            regions[i] = (Region)super.parts[i];
        }
        return regions;
    }

    public void setRegions(Region[] regions){
        this.parts = regions;
    }

    public State(String name, String capital, double square) {
        super(name, capital, square);
    }
    public State(String name, String capital, double square, Region[] regions) {
        super(name, capital, square, regions);
        //this.parts =regions;
    }

}
