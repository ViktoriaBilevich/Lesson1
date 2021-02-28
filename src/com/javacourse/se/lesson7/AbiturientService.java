package com.javacourse.se.lesson7;
//1.Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//        Создать массив объектов. Вывести:
//        a) список абитуриентов, имеющих неудовлетворительные оценки;
//        b) список абитуриентов, у которых сумма баллов выше заданной;
//        c) выбрать заданное число n абитуриентов, имеющих самую высокую
//        сумму баллов (вывести также полный список абитуриентов, имеющих
//        полупроходную сумму).

public class AbiturientService {
    //a) список абитуриентов, имеющих неудовлетворительные оценки;
    public static Abiturient [] findAbiturientsByUnsatisfactoryGrades(Abiturient [] abiturients, int grade) {
        int counter = 0;
        for (int i = 0; i < abiturients.length; i++) {
            for (int j = 0; j < abiturients[i].grades.length; j++) {
                if (abiturients[i].grades[j] <= grade) {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            return null;
        }
        Abiturient [] result = new Abiturient[counter];
        int index = 0;
        for (int i = 0; i < abiturients.length; i++) {
            for (int j = 0; j < abiturients[i].grades.length; j++) {
                if (abiturients[i].grades[j] <= grade) {
                    result[index] = abiturients[i];
                    index++;
                }
            }
        }
        return result;
    }

    // b) список абитуриентов, у которых сумма баллов выше заданной;
    public static Abiturient [] findAbiturientsBySumGrades(Abiturient [] abiturients, int sumGrades) {
        int counter = 0;
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].sumGrates() > sumGrades) {
                counter++;
            }
        }
        if (counter == 0) {
            return null;
        }

        Abiturient[] result = new Abiturient[counter];

        int index = 0;
        for (int i = 0; i < abiturients.length; i++) {

            if (abiturients[i].sumGrates() > sumGrades) {
                result[index] = abiturients[i];
                index++;
            }
        }
        return result;
    }

    //   c) выбрать заданное число n абитуриентов, имеющих самую высокую
//        сумму баллов (вывести также полный список абитуриентов, имеющих
//        полупроходную сумму).
    public Abiturient [] selectAbiturientsByMaxSumGrades(Abiturient [] abiturients, int countAbiturients) {

        for (int start = 0; start < abiturients.length - 1; start++) {
            for (int index = 0; index < abiturients.length - 1 - start; index++) {
                if (abiturients[index].sumGrates() < abiturients[index + 1].sumGrates()) {
                    Abiturient temp = abiturients[index];
                    abiturients[index] = abiturients[index + 1];
                    abiturients[index + 1] = temp;
                }
            }
        }
        if (abiturients.length - 1 < countAbiturients) {
            countAbiturients = abiturients.length - 1;
        }

        Abiturient [] result = new Abiturient[countAbiturients];
        for (int i = 0; i < countAbiturients; i++) {
            result[i] = abiturients[i];
        }
        return result;
    }

    public Abiturient [] selectAbiturientsBySemiBoreGrades(Abiturient [] abiturients, int countAbiturients) {
        Abiturient[] incomingAbiturients = selectAbiturientsByMaxSumGrades(abiturients, countAbiturients);
        int passingScore = incomingAbiturients[incomingAbiturients.length - 1].sumGrates();
        int counter = 0;
        for (int i = 0; i < abiturients.length; i++) {
            if (passingScore == abiturients[i].sumGrates()) {
                counter++;
            }
        }
        Abiturient[] result = new Abiturient[counter];
        int index = 0;
        for (int i = 0; i < abiturients.length; i++) {
            if (passingScore == abiturients[i].sumGrates()) {
                result[index] = abiturients[i];
                index++;
            }
        }

        return result;
    }

}


