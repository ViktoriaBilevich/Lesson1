package com.javacourse.se.lesson5;

//3.Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.
//        Создать массив объектов. Вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года
public class BookService {

    public static void displayBooksByAuthor(Book[] books, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].author == author) {
                System.out.println(books[i].author + " " + books[i].name);
            }
        }
    }

    public static void displayBooksByPublishingHouse(Book[] books, String publishingHouse) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishingHouse == publishingHouse) {
                System.out.println(books[i].publishingHouse + " " + books[i].author + " " + books[i].name);
            }
        }
    }

    public static void displayBooksByYearPublication(Book[] books, int yearPublication) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearPublication > yearPublication) {
                System.out.println(books[i].yearPublication + " " + books[i].author + " " + books[i].name);
            }
        }
    }

}
