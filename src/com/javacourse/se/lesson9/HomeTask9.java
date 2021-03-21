package com.javacourse.se.lesson9;

import java.util.*;

public class HomeTask9 {

    public void subTaskOne() {
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int mark = (int) Math.random() * 10;
            marks.add(mark);
        }

        Iterator<Integer> iter = marks.iterator();
        int maxMark = 0;
        while (iter.hasNext()) {
            if (iter.next() > maxMark) {
                maxMark = iter.next();
            }
        }

        System.out.println(maxMark);
    }

    public void subTaskThree() {
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int mark = (int) Math.random() * 10;
            marks.add(mark);
        }

        Set<Integer> marksWithoutDuplicate = new LinkedHashSet<Integer>(marks);
        int i = 0;
        for (Integer m : marksWithoutDuplicate) {
            System.out.println("" + i + m);
            i++;
        }
    }

    private static Comparator<String> lineComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static String poem =
            "To be or not to be that is the question:\n" +
                    "Whether 'tis nobler in the mind to suffer\n" +
                    "The slings and arrows of outrageous fortune\n" +
                    "Or to take arms against a sea of troubles\n" +
                    "And by opposing end them. To die to sleep\n" +
                    "No more; and by a sleep to say we end\n" +
                    "The heart-ache and the thousand natural shocks\n" +
                    "That flesh is heir to: 'tis a consummation\n"+
                    "Devoutly to be wish'd. To die to sleep\n";


    public static List<String> subTask4(String poem) {
        List<String> lines = Arrays.asList(poem.split("\n"));
        Collections.sort(lines, lineComparator);

        return lines;
    }

    public static HashMap<String, Integer> subTask2(String text) {
        String[] words = text.split("\\s+");
        HashMap<String, Integer> wordWithCount = new HashMap<>();
        for (String word : words) {
            if (!wordWithCount.containsKey(word)) {
                wordWithCount.put(word, 0);
            }
            wordWithCount.put(word, wordWithCount.get(word) + 1);
        }

        return wordWithCount;
    }
}


