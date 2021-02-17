package com.javacourse.se.lesson5;

//4.Реализовать методы сложения, вычитания, умножения и деления объектов.
//        Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
//        Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
//        Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным
//        индексом путем добавления следующего за ним элемента.
public class Fraction {
    public int m;
    public int n;

    public Fraction(int m, int n) {
        this.m = m;
        if(n!=0){
        this.n = n;}
        else{
            System.out.println("Введите число не равное 0");
        }
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
