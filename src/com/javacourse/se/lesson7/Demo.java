package com.javacourse.se.lesson7;

import com.javacourse.se.lesson7.touristAgency.model.Food;
import com.javacourse.se.lesson7.touristAgency.model.Tour;
import com.javacourse.se.lesson7.touristAgency.model.TourCategory;
import com.javacourse.se.lesson7.touristAgency.model.Transport;
import com.javacourse.se.lesson7.touristAgency.service.TourService;

import java.util.ArrayList;
import java.util.Scanner;

import static com.javacourse.se.lesson7.AbiturientService.*;

public class Demo {

    public static void main(String[] args) {
//Task1
        AbiturientService abiturientService = new AbiturientService();

        Abiturient [] abiturients = new Abiturient[]{
                new Abiturient(234769906, "Васильева", "Екатерина", "Юрьева", "Брест, ул. Московская, 1", "+54835053", new int[]{4, 7, 9, 2, 7}),
                new Abiturient(234769786, "Ветров", "Иван", "Петрович", "Брест, ул.Смирнова, 7", "+54835663", new int[]{7, 6, 9, 8}),
                new Abiturient(234769567, "Дориан", "Джон", "Петрович", "Минск, ул.Петровская, 18", "+54833463", new int[]{4, 6, 3, 3}),
                new Abiturient(234769546, "Кокс", "Персиваль", "Иванович", "Минск, ул.Смирнова, 14", "+54835669", new int[]{6, 8, 9, 8}),
                new Abiturient(234769987, "Рид", "Эллиот", "Дмитриевна", "Брест, ул.Ленина, 7", "+54835273", new int[]{7, 8, 9, 10}),
                new Abiturient(234769437, "Рид", "Анфиса", "Дмитриевна", "Брест, ул.Ленина, 17", "+54868273", new int[]{4, 5, 4, 3}),
                new Abiturient(234769987, "Петров", "Игорь", "Денисович", "Минск, ул.Ленина, 7", "+54435273", new int[]{4, 4, 2, 6}),
                new Abiturient(234769987, "Яковлев", "Ян", "Борисович", "Брест, ул.Гродненская, 12", "+54834673", new int[]{3, 5, 4, 2})};

        Abiturient [] abiturientsByGrades = findAbiturientsByUnsatisfactoryGrades(abiturients, 3);
        for (int i = 0; i < abiturientsByGrades.length; i++) {
            System.out.println(abiturientsByGrades[i].toString());
        }
        System.out.println();
        Abiturient [] abiturientsBySumGretes = findAbiturientsBySumGrades(abiturients, 28);
        for (int i = 0; i < abiturientsBySumGretes.length; i++) {
            System.out.println(abiturientsBySumGretes[i].toString());
        }
        System.out.println();
        Abiturient [] selectAbits = abiturientService.selectAbiturientsByMaxSumGrades(abiturients, 3);

        for (Abiturient ab : selectAbits) {
            System.out.println(ab.sumGrates() + " " + ab.toString());
        }
        System.out.println();
        Abiturient [] selectPassingScore = abiturientService.selectAbiturientsBySemiBoreGrades(abiturients, 5);

        for (Abiturient ab1 : selectPassingScore) {
            System.out.println(ab1.sumGrates() + " " + ab1.toString());
        }

        //Task2
        State state = new State("Беларусь", "Минск", 207600);

        Region[] regions = new Region[]{
                new Region("Гродненская", "Гродно", 34600),
                new Region("Витебская", "Витебск", 34600),
                new Region("Брестская", "Брест", 34600),
                new Region("Могилевская", "Могилев", 34600),
                new Region("Гомельская", "Гомель", 34000),
                new Region("Минская", "Минск", 35200),
        };
        state.setRegions(regions);
        System.out.println(state.getCapital());
        System.out.println(state.getSquare());
        System.out.println(state.getCountRegions());
        String[] regionsCapital = state.getCapitalRegions();
        for (int i = 0; i < regionsCapital.length; i++) {
            System.out.print(regionsCapital[i] + " ");
        }
        System.out.println();
        boolean r = state.equals(new State("Минская", "Минск", 35200));
        System.out.println(r);

        System.out.println(state.toString());

        System.out.println(" ");
        State nSt = state;
        System.out.println(state.equals(nSt));



        Region[] regions1 = new Region[]{
                new Region("Могилевская", "Могилев", 400),
                new Region("Гомельская", "Гомель", 34000),
                new Region("Минская", "Минск", 35200),
                new Region("Гродненская", "Гродно", 34600),
                new Region("Витебская", "Витебск", 34600),
                new Region("Брестская", "Брест", 34600)

        };
        State state1 = new State("Беларусь", "Минск", 207600, regions1);
        //var rfd = state1.getRegions(); //[0]. = "test";
        //boolean eql = state.equals(state1);
        //System.out.println(eql);
        Scanner scaner = new Scanner(System.in);
        System.out.println("Выбирете категорию отдыха: \n 1. Отдых на море \n 2. Туристическая поездка \n 3. Лечение %nВведите номер:");
        String category = scaner.nextLine();
        TourCategory selectedCategory = TourCategory.REST;
        try {
            int num = Integer.parseInt(category);
            if(num ==1) {
                selectedCategory = TourCategory.REST;
            }else if (num==2){
                selectedCategory = TourCategory.EXCURSIONS;
            }else if (num==3){
                selectedCategory = TourCategory.TREATMENT;
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("не валидное значение, вводите число  1, 2 или 3");
        }
        TourService service = new TourService();
        ArrayList<Tour> tours = service.getTours(selectedCategory);
        for (Tour t : tours){
            System.out.println(t.toString());
            System.out.println();
        }
        System.out.println("Выберите номер тура");
        String tourNumber = scaner.nextLine();
        int tourId = 1;

        try {
            tourId = Integer.parseInt(tourNumber);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("не валидное значение, введите число");
        }

        Tour selectedTour = service.getTourById(selectedCategory, tourId);

        System.out.println("Вы выбрали: \n" + selectedTour.toString());
        System.out.println("Выберите транспорт, 1 - автобус, 2 - поезд, 3 - самолет, 4 -корабль");
        String transportType = scaner.nextLine();
        int transportId = 0;
        Transport transport = Transport.BUS;
        try {
            transportId = Integer.parseInt(transportType);
            if(transportId == 1){
                transport = Transport.BUS;
            }else if(transportId ==2){
                transport = Transport.TRAIN;
            }else if(transportId == 3){
                transport = Transport.PLANE;
            }else if(transportId == 4){
                transport = Transport.SHIP;
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("не валидное значение, введите число");
        }

        System.out.println("Введите количество дней тура:");
        String days = scaner.nextLine();
        int countDays = selectedTour.getCountDays();
        try {
            countDays = Integer.parseInt(days);

        }
        catch (NumberFormatException exception)
        {
            System.out.println("не валидное значение, введите число");
        }

        System.out.println("Выберите питание: 1 - без питания; 2 - одноразовое; 2- двуразовое; 3 - полное питание, в любое время.");
        String food = scaner.nextLine();
        int foodId = 0;
        Food selectedFood = Food.NONE;
        try {
            foodId = Integer.parseInt(food);
            if(foodId == 1){
                selectedFood = Food.NONE;
            }else if(foodId ==2){
                selectedFood = Food.ONCE;
            }else if(foodId == 3){
                selectedFood = Food.TWICE;
            }else if(foodId == 4){
                selectedFood = Food.TWICE;
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("не валидное значение, введите число");
        }

        service.settingsOrderedTour(selectedTour, countDays,transport, selectedFood);

        System.out.println("Вы выбрали:\n" +selectedTour.toString());
    }


}
