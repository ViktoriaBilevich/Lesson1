package com.javacourse.se.lesson6;

public interface MySuperArray {

        //Получить текущую длину массива
        int getLength();

        //Добавить элемент. Длинна массива должна увеличится на 1.
        int addElement(Integer element);

        //Получить элемент по индексу
        Integer getElement(int index);

        //Удалить все текущие элементы (длина массива будет 0 псосле этой операции)
        void removeAllElements();

        //Вернуть массив где находятся все текущие элементы
        Integer[] getAllElements();
    }
