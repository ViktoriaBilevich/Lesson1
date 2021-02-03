package com.javacourse.se.lesson2;

public class HomeTask2 {

    public void reverseNumber() {
        int abcd = 4125;
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            int n = abcd % 10; //остаток = последняя цифра
            abcd = abcd / 10; //уменьш разрядa
            array[i] = n;
        }
        int result = array[0] * 1000 + array[1] * 100 + array[2] * 10 + array[3];
        System.out.println("Обратное число " + result);
    }

    public void compareNumber() {
        int abcd = 5363;
        int[] array = new int[4];
        for (int i = 3; i >= 0; i--) {
            int n = abcd % 10; //остаток = последняя цифра
            abcd = abcd / 10; //уменьш разрядa
            array[i] = n;
        }
        if (array[0] != array[1] && array[0] != array[2] && array[0] != array[3] && array[1] != array[2] && array[1] != array[3] && array[2] != array[3]) {
            System.out.println("Все цифры числа различны");
        } else {
            System.out.println("Все цифры числа не различны");
        }
    }
}
