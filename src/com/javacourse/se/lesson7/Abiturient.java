package com.javacourse.se.lesson7;

//1.Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//        Создать массив объектов. Вывести:
//        a) список абитуриентов, имеющих неудовлетворительные оценки;
//        b) список абитуриентов, у которых сумма баллов выше заданной;
//        c) выбрать заданное число n абитуриентов, имеющих самую высокую
//        сумму баллов (вывести также полный список абитуриентов, имеющих
//        полупроходную сумму).

import java.util.Arrays;

public class Abiturient {

    long id;
    String lastName;
    String firstName;
    String patronymic;
    String address;
    String phoneNumber;
    int[] grades;

    public Abiturient(long id, String lastName, String firstName, String patronymic, String address, String phoneNumber, int[] grades) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.grades = grades;
    }

    public int sumGrates() {
        int sum = 0;

        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
