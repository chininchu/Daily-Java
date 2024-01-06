package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        // Write your code here


        Map<Character, Integer> duplicate = new HashMap<>();


        int result = 0;


        for (int i = 0; i < text.length(); i++) {

            char ch = text.toLowerCase().charAt(i);


            duplicate.put(ch, duplicate.getOrDefault(ch, 0) + 1);


        }


        for (Map.Entry<Character, Integer> entry : duplicate.entrySet()) {


            if (entry.getValue() >= 2) {


                result++;


            }


        }


        return result;


    }

}
