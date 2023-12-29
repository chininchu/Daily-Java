package com.example;


//The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.


import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {


    static String encode(String word) {

        Map<Character, Integer> charCounts = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for (char c : word.toCharArray()) {

            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);

            if (charCounts.get(c) > 1) {

                result.append(")");

            } else {

                result.append("(");


            }


        }


        return result.toString();


    }


}






