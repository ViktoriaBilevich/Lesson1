package com.javacourse.se.lesson2;

public class HomeTask2 {

    // Task 4 Определить число, полученное выписыванием в обратном порядке цифр
    // любого 4-х значного натурального числа n.

    public void reverseNumber() {

        int number = 54125;
        int temp = number;
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count = count + 1;
        }

        int array[] = new int[count];

        temp = number;
        int result = 0;
        int index = 0;
        while (temp > 0) {
            int n = temp % 10;
            temp = temp / 10;
            array[index] = n;
            index = index + 1;
        }

        for (int i = 0; i < array.length; i++) {
            result = result + (int) (array[i] * Math.pow(10, count - 1));
            count--;
        }
        System.out.println("Обратное число " + result);
    }

// Task 5 Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

    public void compareNumber() {

        int number = 53687;
        int temp = number;
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count = count + 1;
        }

        int array[] = new int[count];

        temp = number;
        int index = 0;
        while (temp > 0) {
            int n = temp % 10;
            temp = temp / 10;
            array[index] = n;
            index = index + 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Все цифры числа не различны");
                    return;
                }
            }
        }
        System.out.println("Все цифры числа различны");
    }
}
