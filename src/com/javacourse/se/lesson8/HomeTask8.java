package com.javacourse.se.lesson8;

public class HomeTask8 {
// 1. Напишите метод для поиска самой длинной строки в массиве.

    public String findStringMaxLengthString(String[] words) {
        int index = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[index].length() < words[i].length()) {
                index = i;
            }
        }
        String result = words[index];
        return result;
    }

//2. Напишите метод, который проверяет является ли слово палиндром.

    boolean isPalindrom(String word) {

        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
// 3. Напишите метод, заменяющий в тексте все вхождения слова "бяка" на "вырезано цензурой".

    public String replaceWordsInText(String text, String searchWord, String replaceWord) {
        return text.replaceAll(searchWord, replaceWord);
    }

    // 4. Имеются две строки. Напишите метод, возвращающий кол-во вхождений одной строки в другую.

    public int countSubstringInSring(String text, String findStr) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = text.indexOf(findStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }

    // 5. Написать метод, который проверяет является ли строка ip-адресом.
    public static boolean isValidIP(String ip) {

        if (ip == null || ip.isEmpty()) {
            return false;
        }

        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        try {
            for (String s : parts) {
                int i = Integer.parseInt(s);
                if ((i < 0) || (i > 255)) {
                    return false;
                }
            }
        } catch (NumberFormatException nfe) {
            return false;
        }

        if (ip.endsWith(".")) {
            return false;
        }
        return true;
    }
}
