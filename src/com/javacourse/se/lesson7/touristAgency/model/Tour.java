package com.javacourse.se.lesson7.touristAgency.model;

public class Tour {
    private int id;
    private String name;
    private String description;
    private TourCategory category;
    private Transport transport;
    private Food food;
    private double price;
    private int countDays;

    public Tour(){
    }

    @Override
    public String toString() {
        return "Тур:" +
                "номер=" + id +
                ", " + name + '\'' +
                ", Описание:='" + description + '\'' +
                ", Категория=" + category +
                ", Транспорт=" + transport +
                ", Питание=" + food +
                ", Цена=" + price +
                ", количество дней=" + countDays;
    }

    public Tour(int id, String name, String description, double price, int countDays, TourCategory category, Transport transport, Food food){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.transport = transport;
        this.food = food;
        this.countDays = countDays;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public TourCategory getCategory(){
        return this.category;
    }

    public Transport getTransport(){
        return this.transport;
    }

    public void setTransport(Transport transport){
        this.transport = transport;
    }

    public Food getFood(){
        return  this.food;
    }

    public void setFood(Food food){
        this.food = food;
    }
    public int getCountDays(){
        return  this.countDays;
    }

    public void setCountDays(int days){
        this.countDays = days;
    }

    public double getPrice() {
        return price;
    }
}
