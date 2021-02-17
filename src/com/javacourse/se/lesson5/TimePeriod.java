package com.javacourse.se.lesson5;

//1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
//  в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//        Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов.
//
//        Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//        по отдельности. Сделать метод для вывода данных.

public class TimePeriod {
    int seconds;
    int minutes;
    int hours;

    public TimePeriod(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds - this.hours * 3600) / 60;
        this.seconds = seconds % 60;
    }

    public TimePeriod(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int convertTimePeriodToSeconds() {
        int result = this.hours * 3600 + this.minutes * 60 + this.seconds;
        return result;
    }

    public int compareTimePeriods(TimePeriod timePeriod) {
        int result = this.convertTimePeriodToSeconds() - timePeriod.convertTimePeriodToSeconds();
        return result;
    }

    public void print() {
        System.out.println(this.hours + " ч. " + this.minutes + " мин. " + this.seconds + " с. ");
    }
}
