package com.javacourse.se.lesson4;

public class HomeTask4 {

    // Task 1 Создать двухмерный квадратный массив, и заполнить его «бабочкой»
    public void matrix() {
        int n = 5;
        int array[][] = new int[n][n];

        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // Проверка для 5х5
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1
        // Проверка для 6х6
//        1 1 1 1 1 1
//        0 1 1 1 1 0
//        0 0 1 1 0 0
//        0 0 1 1 0 0
//        0 1 1 1 1 0
//        1 1 1 1 1 1
    }

    //Task 2 Найти сумму элементов на главной диагонали матрицы n*n. Число n задается пользователем.

    public void maxNumber() {
        int n = 5, sum = 0;

        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 5;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i != j) {
                    continue;
                } else {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    //Проверка для 5х5 и array[i][j]=5 ---> 25
    //Проверка для 0х0 и array[i][j]=5 ---> 0
    //Проверка для 100х100 и array[i][j]=5 ---> 500
    //Проверка для 5х5 и array[i][j]=i+j ---> 20
    //01234
    //12345
    //23456
    //34567
    //45678
}