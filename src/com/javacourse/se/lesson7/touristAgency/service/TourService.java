package com.javacourse.se.lesson7.touristAgency.service;

import com.javacourse.se.lesson7.touristAgency.model.Food;
import com.javacourse.se.lesson7.touristAgency.model.Tour;
import com.javacourse.se.lesson7.touristAgency.model.TourCategory;
import com.javacourse.se.lesson7.touristAgency.model.Transport;

import java.util.ArrayList;
import java.util.List;

public class TourService {

    private ArrayList<Tour> restTours = new ArrayList<Tour>(){};
    private ArrayList<Tour> excursionTours = new ArrayList<Tour>(){};
    private ArrayList<Tour> treatmentTours = new ArrayList<Tour>(){};
    //private ArrayList<Tour> shoppingTours = new ArrayList<Tour>(){};
    //private ArrayList<Tour> cruiseTours = new ArrayList<Tour>(){};

    public TourService(){
        Tour rest1 = new Tour(1, "Отдых в Испании","Отдых на море в Барселоне отель 4 звезды",899.99, 7, TourCategory.REST, Transport.BUS, Food.FULL  );
        Tour rest2 = new Tour(2, "Отдых в Черногории","Отдых на море в Будве отель 5 звезды",999.99, 10, TourCategory.REST, Transport.BUS, Food.ONCE  );
        Tour rest3 = new Tour(3,"Отдых в Турция","Отдых на море в Анталии отель 5 звезды",1099.99, 14, TourCategory.REST, Transport.PLANE, Food.TWICE  );
        this.restTours.add(rest1);
        this.restTours.add(rest2);
        this.restTours.add(rest3);

        Tour excursion1 = new Tour(4,"Евротур","Туристическая поездка по Варшаве, Берлину, Парижу, Нюрнбергу, Вене",1200.00, 14, TourCategory.EXCURSIONS, Transport.BUS, Food.NONE  );
        Tour excursion2 = new Tour(5,"Тур по Беларуси","Туристическая поездка через Минск, Брест, Гродно, Витебск, Могилев  и Гомель",300, 7, TourCategory.EXCURSIONS, Transport.BUS, Food.NONE  );
        Tour excursion3 = new Tour(6, "Золотое кольцо России","Туристическая поездка через Москву, Питер, Владимир, Тверь, Новгрод, Псков, Суздаль",550, 10, TourCategory.EXCURSIONS, Transport.BUS, Food.ONCE  );
        this.excursionTours.add(excursion1);
        this.excursionTours.add(excursion2);
        this.excursionTours.add(excursion3);

        Tour treatment1 = new Tour(7,"Карловарские источники","Лечение желудка минеральными водами",1300.00, 21, TourCategory.TREATMENT, Transport.BUS, Food.FULL  );
        Tour treatment2 = new Tour(8,"Санаторий Роддон в Гродненской обл","лечение опорно двигательных функций",900, 14, TourCategory.TREATMENT, Transport.BUS, Food.TWICE  );
        Tour treatment3 = new Tour(9,"Грязевые источники в Анапе","Лечение кожанных заболеваний лечебными грязями в Анапе",1150, 10, TourCategory.TREATMENT, Transport.BUS, Food.ONCE  );
        this.treatmentTours.add(treatment1);
        this.treatmentTours.add(treatment2);
        this.treatmentTours.add(treatment3);
    }

    public ArrayList<Tour> getTours(TourCategory category){
        ArrayList<Tour> result = new ArrayList<>();
        switch (category){
            case REST:
                result= this.restTours;
                break;
            case TREATMENT:
                result = this.treatmentTours;
                break;
            case EXCURSIONS:
                result = this.excursionTours;
                break;
        }

        return result;
    }

    public Tour getTourById(TourCategory category, int id){
        ArrayList<Tour> tours = getTours(category);
        for(Tour t: tours){
            if(t.getId() == id){
                return new Tour(t.getId(), t.getName(), t.getDescription(), t.getPrice(), t.getCountDays(), t.getCategory(), t.getTransport(), t.getFood());
            }
        }

        return tours.get(0);
    }

    public void settingsOrderedTour(Tour tour, int days, Transport transport, Food food){
        tour.setCountDays(days);
        tour.setTransport(transport);
        tour.setFood(food);
    }


}
