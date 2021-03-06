package com.javacourse.se.lesson3;

public class HomeTask3 {


    // Task 1 Найти максимальный элемент в массиве заданной длинны.

    public void maxNumber() {
        int array[] = {20, 34, 98, 86, 79, 15};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    // Task 2.1 Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

    public void increaseNumber() {
        int array[] = {20, 34, 98, 86, 79, 15};
        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Task 2.2
    public void decreaseNumber() {
        int array[] = {20, 34, 98, 86, 79, 15};
        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                if (array[index] < array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Task 3 Вычислить: 1+2+4+8+…+256

    public void Sum() {
        double sum = 0;
        for (double i = 0.5; i <= 128; i = i * 2) {
            sum += i * 2;
        }
        System.out.println((int) sum);
    }


    // Task 4 Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

    public void multNum() {
        int a = 3, b = 5, c = 0;
        for (int i = 1; i <= b; i++) {
            c = c + a;
        }
        System.out.println(c);
    }

    // Task 5 Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    //сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public void multAmeba() {
        int a = 1;
        for (int i = 3; i <= 24; i = i + 3) {
            a = a * 2;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    // Task 6 Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
    //день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
    //суммарный путь пробежит спортсмен за 7 дней?

    public void run() {
        double dist = 10, weekDist = dist, normPercent = 10;
        for (int i = 2; i <= 7; i++) {
            dist *= (100+normPercent)/100;
            weekDist += dist;
        }
        System.out.println(weekDist);
    }

    // Task 7 Определите сумму элементов одномерного массива, расположенных между
    //минимальным и максимальным значениями.

    public void maxMinSum() {
        int array[] = {17, 2, 34, 45, 27, 89, 6};
        int max = array[0];
        int min = array[0];
        int maxIndex = 0, minIndex = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }

            if (array[i] < min) {
                minIndex = i;
                min = array[i];
            }
        }
        int iMax = 0, iMin = 0;

        if (maxIndex > minIndex) {
            iMax = maxIndex;
            iMin = minIndex;
        } else {
            iMax = minIndex;
            iMin = maxIndex;
        }

        for (int c = iMin + 1; c < iMax; c++) {
            sum += array[c];
        }
        System.out.println(sum);
    }

    // Task 8 Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

    public void factorial() {
        int result = 1;
        for (int i = 10; i <= 15; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

    // Task 9 Реализовать бинарный поиск в массиве.
    public void binarySearch() {
        int array[] = {20, 34, 98, 15, 3, 77, 9};
        int searchNumb = 15;

        for (int i = 0; i < array.length - 1; i++) {
            int first = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[first]) {
                    first = j;
                }
            }
            int temp = array[i];
            array[i] = array[first];
            array[first] = temp;
        }

        int indexFirst = 0;
        int indexLast = array.length - 1;
        int index = 0;
        while (indexFirst <= indexLast) {
            int middle = (indexFirst + indexLast) / 2;
            if (array[middle] < searchNumb) {
                indexFirst = middle + 1;
            } else if (array[middle] > searchNumb) {
                indexLast = middle - 1;
            } else if (array[middle] == searchNumb) {
                index = middle;
                break;
            }
        }
        System.out.println(index);
    }
}
