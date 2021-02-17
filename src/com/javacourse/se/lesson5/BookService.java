package com.javacourse.se.lesson5;

//3.Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.
//        Создать массив объектов. Вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года
public class BookService {

    public static Book[] findBooksByAuthor(Book[] books, String author) {

        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].authors.length; j++) {
                if (books[i].authors[j] == author) {
                counter++;
                }
            }
        }
        if(counter == 0){
            return null;
        }
        Book[] result = new Book[counter];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].authors.length; j++) {
                if (books[i].authors[j] == author) {
                    result[index]=books[i];
                    index++;
                }
            }
        }
        return result;
    }

    public static Book[] findBooksByPublishingHouse(Book[] books, String publishingHouse) {
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishingHouse == publishingHouse) {
                counter++;
            }
        }
        if(counter == 0){
            return null;
        }
        Book[] result = new Book[counter];
        int index=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishingHouse == publishingHouse) {
                result[index] = books[i];
                index++;
            }
        }
        return result;
    }

    public static Book[] findBooksByYearPublication(Book[] books, int yearPublication) {

        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearPublication > yearPublication) {
                counter++;
            }
        }
        if(counter == 0){
            return null;
        }
        Book[] result = new Book[counter];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearPublication > yearPublication) {
                result[index] = books[i];
                index++;
            }
        }
        return result;
    }
}
