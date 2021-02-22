package com.javacourse.se.lesson7;

public class Demo {

    public static void main(String[] args) {
//Task1
        AbiturientService abiturientService = new AbiturientService();

        Abiturient[] abiturients = new Abiturient[]{
                new Abiturient(234769906, "Васильева", "Екатерина", "Юрьева", "Брест, ул. Московская, 1", "+54835053", new int[]{4, 7, 9, 2, 7}),
                new Abiturient(234769786, "Ветров", "Иван", "Петрович", "Брест, ул.Смирнова, 7", "+54835663", new int[]{7, 6, 9, 8}),
                new Abiturient(234769567, "Дориан", "Джон", "Петрович", "Минск, ул.Петровская, 18", "+54833463", new int[]{4, 6, 3, 3}),
                new Abiturient(234769546, "Кокс", "Персиваль", "Иванович", "Минск, ул.Смирнова, 14", "+54835669", new int[]{6, 8, 9, 8}),
                new Abiturient(234769987, "Рид", "Эллиот", "Дмитриевна", "Брест, ул.Ленина, 7", "+54835273", new int[]{7, 8, 9, 10}),
                new Abiturient(234769437, "Рид", "Анфиса", "Дмитриевна", "Брест, ул.Ленина, 17", "+54868273", new int[]{4, 5, 4, 3}),
                new Abiturient(234769987, "Петров", "Игорь", "Денисович", "Минск, ул.Ленина, 7", "+54435273", new int[]{4, 4, 2, 6}),
                new Abiturient(234769987, "Яковлев", "Ян", "Борисович", "Брест, ул.Гродненская, 12", "+54834673", new int[]{3, 5, 4, 2})};

        Abiturient[] abiturientsByGrades = AbiturientService.findAbiturientsByUnsatisfactoryGrades(abiturients, 3);
        for (int i = 0; i < abiturientsByGrades.length; i++) {
            System.out.println(abiturientsByGrades[i].toString());
        }
        System.out.println();
        Abiturient[] abiturientsBySumGretes = AbiturientService.findAbiturientsBySumGrades(abiturients, 28);
        for (int i = 0; i < abiturientsBySumGretes.length; i++) {
            System.out.println(abiturientsBySumGretes[i].toString());
        }
        System.out.println();
        Abiturient[] selectAbits = abiturientService.selectAbiturientsByMaxSumGrades(abiturients, 3);

        for (Abiturient ab : selectAbits) {
            System.out.println(ab.sumGrates() + " " + ab.toString());
        }
        System.out.println();
        Abiturient[] selectPassingScore = abiturientService.selectAbiturientsBySemiBoreGrades(abiturients, 5);

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
        boolean eql = state.equals(state1);
        System.out.println(eql);
    }


}
