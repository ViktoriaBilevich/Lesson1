package com.javacourse.se.lesson5;

//2.Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, номер банковского счета
//        Создать массив объектов. Вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

public class CustomerService {
    public static void displayArrayCustomerSortedByAscending(Customer[] customers) {

        for (int start = 0; start < customers.length - 1; start++) {
            for (int index = 0; index < customers.length - 1 - start; index++) {
                if (customers[index].lastName.compareTo(customers[index + 1].lastName) > 0) {
                    Customer temp = customers[index];
                    customers[index] = customers[index + 1];
                    customers[index + 1] = temp;
                }
            }
        }
        for (int i = 0; i < customers.length; i++) {
            System.out.print(customers[i].lastName + " " + customers[i].firstName + ", ");
        }
        System.out.println();
    }

    public static void displayArrayCustomerSortedByCreditCardNumber(Customer[] customers, int minCardNumber, int maxCardNumber) {

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].creditCardNumber > minCardNumber && customers[i].creditCardNumber < maxCardNumber) {
                System.out.println(customers[i].creditCardNumber + " " + customers[i].lastName + " " + customers[i].firstName + ", ");
            }
        }
    }
}
