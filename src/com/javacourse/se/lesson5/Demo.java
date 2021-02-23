package com.javacourse.se.lesson5;

///4.Реализовать методы сложения, вычитания, умножения и деления объектов.
//        Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
//        Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
//        Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным
//        индексом путем добавления следующего за ним элемента.
public class Demo {


    public static void main(String[] args) {

        // Task 1
        TimePeriod tp = new TimePeriod(4500);
        TimePeriod tp1 = new TimePeriod(3, 56, 43);
        int result = tp.compareTimePeriods(tp1);
        System.out.println(result);
        tp.print();
        tp1.print();
//Task 2
        Customer[] customer = new Customer[5];
        Customer ted = new Customer(768, "Mosby", "Ted", "Fedorovich", 67, "99");
        Customer marshal = new Customer(1768, "Ericson", "Marshal", "Marshalovich", 657, "989");
        Customer burny = new Customer(76788, "Stinson", "Burny", "Filipovich", 6977, "99999");
        Customer robin = new Customer(7658, "Cherbatsky", "Robin", "Ivanovna", 6799, "99654");
        Customer lily = new Customer(79055, "Aldrin", "Lily", "Petrovna", 78797465, "7908766");
        customer[0] = ted;
        customer[1] = marshal;
        customer[2] = burny;
        customer[3] = robin;
        customer[4] = lily;

        CustomerService.sortedCustomersByAscending(customer);
        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i].toString());
        }
        Customer[] filteredCustomers = CustomerService.findCustomersByCreditCardNumber(customer, 600, 7000);
        System.out.println();
        for (int i = 0; i < filteredCustomers.length; i++) {
            System.out.println(filteredCustomers[i].toString());
        }
        System.out.println();

// Task 3
        Book[] book = new Book[]{
                new Book(90849494, "Незнайка на луне", new String[]{"Носов"}, "Асвета", 2005, 43, 5),
                new Book(8552565, "Незнайка в солнечном городе", new String[]{"Носов"}, "Поппури", 2008, 39, 7.3),
                new Book(34454363, "Страж", new String[]{"Пехов"}, "Альфа-книга", 2019, 245, 21.70),
                new Book(44353452, "Хроники Сиалы", new String[]{"Пехов"}, "Альфа-книга", 2020, 1151, 45.7),
                new Book(676667, "Тень ингениума", new String[]{"Пехов"}, "Детектив", 2020, 307, 20.52)};

        Book[] booksByAutor = BookService.findBooksByAuthor(book, "Пехов");
        for (int i = 0; i < booksByAutor.length; i++) {
            System.out.println(booksByAutor[i].toString());
        }

        Book[] booksByPublishingHouse = BookService.findBooksByPublishingHouse(book, "Альфа-книга");
        for (int i = 0; i < booksByPublishingHouse.length; i++) {
            System.out.println(booksByPublishingHouse[i].toString());
        }
        Book[] booksByYearPublication = BookService.findBooksByYearPublication(book, 2010);
        for (int i = 0; i < booksByYearPublication.length; i++) {
            System.out.println(booksByYearPublication[i].toString());
        }

        //Task 4
        Fraction fraction = new Fraction(5, 6);
        Fraction fraction2 = new Fraction(3, 8);
        Fraction fs = FractionService.sum(fraction, fraction2);

        System.out.println("сумма: " + fs.m + "/" + fs.n);

        FractionService fs1 = new FractionService();

        Fraction fr = fs1.minus(fraction, fraction2);
        System.out.println("разность: " + fr.m + "/" + fr.n);

        Fraction fr1 = fs1.multiply(fraction, fraction2);
        System.out.println("произведение: " + fr1.m + "/" + fr1.n);

        Fraction fr2 = fs1.divide(fraction, fraction2);
        System.out.println("деление: " + fr2.m + "/" + fr2.n);

        int k = 6;
        Fraction[] fractions = new Fraction[k];

        Fraction f = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 7);
        Fraction f3 = new Fraction(4, 9);
        Fraction f4 = new Fraction(5, 8);
        Fraction f5 = new Fraction(2, 3);
        Fraction f6 = new Fraction(8, 9);

        fractions[0] = f;
        fractions[1] = f2;
        fractions[2] = f3;
        fractions[3] = f4;
        fractions[4] = f5;
        fractions[5] = f6;

        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].toString());
        }
        System.out.println(" ");


        fs1.update(fractions);

        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].toString());
        }
    }
}
