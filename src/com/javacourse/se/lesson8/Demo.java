package com.javacourse.se.lesson8;

public class Demo {

    public static void main(String[] args) {
        HomeTask8 ht = new HomeTask8();
        //1
        String[] words = new String[]{"он", "кот", "медведь", "конфета +", "red"};
        System.out.println(ht.findStringMaxLengthString(words));

        //2
        boolean isPalindrom = ht.isPalindrom("довод");
        System.out.println(isPalindrom);

        //3
        System.out.println(ht.replaceWordsInText("бяка кот собака бяка", "бяка", "вырезано цензурой"));
        //4
        System.out.println(ht.countSubstringInSring("Du Du hast Du hast mich Du hast mich gefragt Du hast mich gefragt und ich hab' nichts gesagt", "Du hast"));
        //5
        System.out.println(HomeTask8.isValidIP("192.168.1.1"));
    }
}
