package com.javacourse.se.lesson6;

public class SuperArray implements MySuperArray{
    Integer [] array;

    public SuperArray(){
        this.array = new Integer [0];
    }

    public SuperArray(int length){
        this.array = new Integer [length];
    }

    //Получить текущую длину массива
    public int getLength(){
        return  array.length;
    }

    //Добавить элемент. Длинна массива должна увеличится на 1.
    public int addElement(Integer element){
        Integer[] newArray = new Integer[this.array.length+1];
        for(int i=0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }
        newArray[this.array.length] = element;
        this.array = newArray;
        return 0;
    }

    //Получить элемент по индексу
    public Integer getElement(int index){
        Integer result = null;
        if(index <= this.array.length) {
            result= this.array[index];
        }else {
            System.out.println("Превышена размерность массива");
        }
        return result;
    }

    //Удалить все текущие элементы (длина массива будет 0 псосле этой операции)
    public void removeAllElements() {
        this.array = new Integer[0];
    }

    //Вернуть массив где находятся все текущие элементы
    public Integer[] getAllElements(){
        return this.array;
    }
}
