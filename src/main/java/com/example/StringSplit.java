package com.example;

// Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').




import java.util.ArrayList;
import java.util.List;

public class StringSplit {

    public static String[] solution(String s) {



        List<Character> list = new ArrayList<>();

        System.out.println(list);


        int counter = 0;


        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            list.add(ch);

            counter++;

            if (counter % 2 == 0) {

                list.add(',');


            }


        }


        if (counter % 2 != 0) {

            list.add('_');


        }


        System.out.println(list.toString());






        return null;


    }


}
