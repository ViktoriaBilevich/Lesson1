package com.javacourse.se.lesson5;
///4.Реализовать методы сложения, вычитания, умножения и деления объектов.
//        Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
//        Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
//        Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным
//        индексом путем добавления следующего за ним элемента.

public class FractionService {

    public static Fraction sum(Fraction first, Fraction second) {
        int resultM;
        int resultN;
        if (first.n != second.n) {
            resultN = second.n * first.n;
            resultM = first.m * second.n + second.m * first.n;
        } else {
            resultM = first.m + second.m;
            resultN = first.n;
        }
        Fraction result = new Fraction(resultM, resultN);
        reductionFraction(result);
        return result;
    }

    public static void reductionFraction(Fraction first) {
        int limit = Math.min(first.m, first.n);
        for (long i = 2; i <= limit; i++) {
            if (first.m % i == 0 && first.n % i == 0) {
                first.m /= i;
                first.n /= i;
            }
        }
    }

    public Fraction minus(Fraction first, Fraction second) {
        int resultM;
        int resultN;
        if (first.n != second.n) {
            resultN = second.n * first.n;
            resultM = first.m * second.n - second.m * first.n;
        } else {
            resultM = first.m - second.m;
            resultN = first.n;
        }
        Fraction result = new Fraction(resultM, resultN);
        reductionFraction(result);
        return result;
    }


    public Fraction multiply(Fraction first, Fraction second) {
        int resultM = first.m * second.m;
        int resultN = first.n * second.n;

        Fraction result = new Fraction(resultM, resultN);
        reductionFraction(result);
        return result;
    }

    public Fraction divide(Fraction first, Fraction second) {
        int resultM = first.m * second.n;
        int resultN = first.n * second.m;

        Fraction result = new Fraction(resultM, resultN);
        reductionFraction(result);
        return result;
    }

    public void update(Fraction[] fractionArray) {
        for (int i = 0; i < fractionArray.length; i++) {
            if (i != 0 && i % 2 == 0 && i + 1 < fractionArray.length) {
                fractionArray[i] = FractionService.sum(fractionArray[i], fractionArray[i + 1]);
            }
        }
    }
}

