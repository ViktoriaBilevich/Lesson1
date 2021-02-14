package com.javacourse.se.lesson5;

//3.Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.
//        Создать массив объектов. Вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года
public class Book {
    long id;
    String name;
    String author;
    String publishingHouse;
    int yearPublication;
    int pages;
    double price;

    public Book(long id, String name, String author, String publishingHouse, int yearPublication, int pages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearPublication = yearPublication;
        this.pages = pages;
        this.price = price;
    }
}
