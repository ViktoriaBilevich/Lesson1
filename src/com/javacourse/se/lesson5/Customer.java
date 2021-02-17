package com.javacourse.se.lesson5;

import java.util.UUID;

//2.Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, номер банковского счета
//        Создать массив объектов. Вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

public class Customer {
    long id;
    String lastName;
    String firstName;
    String patronymic;
    long creditCardNumber;
    String bankAccountNumber;

    public Customer(long id, String lastName, String firstName, String patronymic, long creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}
