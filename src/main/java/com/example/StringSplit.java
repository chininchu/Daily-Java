package com.example;

// Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StringSplit {

    public static String[] solution(String s) {


        List<String> list = new ArrayList<>();


        // Iterate through the string, two characters at a time


        for (int i = 0; i < s.length(); i += 2) {

            if (i + 1 >= s.length()) {

                list.add(s.charAt(i) + "_");


            } else {

                list.add(s.substring(i, i + 2));

            }


        }


        String[] array = list.toArray(new String[0]);


        return array;


    }


}
