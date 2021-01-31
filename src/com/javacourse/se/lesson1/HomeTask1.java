package com.javacourse.se.lesson1;

import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;

public class HomeTask1 {

    public void convertTime(){

        int seconds = 4500;
        int ostSec = seconds%60;
        int minutes = seconds/60;
        System.out.println(" В 4500 секунд " + minutes + " минут " + ostSec + " секунд");

        int ostMin = minutes%60;
        int hour = minutes/60;
        System.out.println(" В 4500 секунд " + hour + " час " + ostMin + " минут " + ostSec + " секунд");

        int ostHour = hour%24;
        int day = hour/24;
        System.out.println(" В 4500 секунд " + day + " дней " + ostHour + " час " + ostMin + " минут " + ostSec + " секунд");

        int ostDay = day%7;
        int week = day/7;
        System.out.println(" В 4500 секунд " + week+ " недель " + ostDay + " дней " + ostHour + " час " + ostMin + " минут " + ostSec + " секунд");
    }

    public void reverseNumber(){
        int n = 4125;
        int ed = n%10;
        int des = (n%100-ed)/10;
        int sot = (n%1000-des)/100;
        int tis = (n%10000-sot)/1000;
        int result = ed*1000 + des*100 + sot*10 + tis;
        System.out.println("Обратное число числа " + n + " является число" + result);
    }

    public void compareNumber(){
        int n = 5863;
        int ed = n%10;
        int des = (n%100-ed)/10;
        int sot = (n%1000-des)/100;
        int tis = (n%10000-sot)/1000;
        if(ed != des && ed != sot && ed != tis && des!=sot && des != tis && sot !=tis) {
            System.out.println("Все цифры числа " + n + " различны");
        } else {
            System.out.println("Все цифры числа " + n + " не различны");
        }
    }

    public void checkNumber() {
        int n = 871;
        int sot = n/100;
        int ed = n%10;
        int chetn = ed%2;

        if (sot<10 && sot>0){
            System.out.println("Число " + n + " является трехзначным");
        }
        else {
            System.out.println("Число " + n + " не является трехзначным");
        }

        if (ed==7){
            System.out.println("Последняя цифра числа " + n + " 7");
        }
        else {
            System.out.println("Последняя цифра числа " + n + " не 7");
        }

        if (chetn==0){
            System.out.println("Число " + n + " является чётным");
        }
        else {
            System.out.println("Число " + n + " не является чётным");}
    }

    public void isCircleCoverRectangle() {
        double a = 4;
        double b = 8;
        double r = 5;
        /* чтобы закрыть прямоугольник полностью, центр круга должен совпадать с центром прямоугольника.
        И его диаметр должен быть равен диагонали прямоугольника. По теореме Пифагора высчитываю d, потом
        разделю на 2*/

        double d = Math.sqrt(a * a + b * b);
        if (r >= (d / 2)) {
            System.out.println("Круг радиусом " + r + " полностью закроет прямоугольник размерами " + a + " и " + b);
        } else {
            System.out.println("Круг радиусом " + r + " не закроет прямоугольник размерами " + a + " и " + b);
        }
    }
}
