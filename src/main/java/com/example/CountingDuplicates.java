package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//TODO Count the number of Duplicates

//TODO Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

//Example
//
//"abcde" -> 0  # no characters repeats more than once
//"aabbcde" -> 2  # 'a' and 'b'
//"aabBcde" -> 2  # 'a' occurs twice and 'b' twice (`b` and `B`)
//"indivisibility" -> 1  # 'i' occurs six times
//"Indivisibilities" -> 2  # 'i' occurs seven times and 's' occurs twice
//"aA11" -> 2  # 'a' and '1'
//"ABBA" -> 2  # 'A' and 'B' each occur twice

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        // Map to store characters and their counts


        Map<Character, Integer> duplicate = new HashMap<>();


        // Counter for distinct characters that repeat


        int result = 0;

        // Iterating over each character in the string


        for (int i = 0; i < text.length(); i++) {

            // Converting character to lower case for case-insensitivity


            char ch = text.toLowerCase().charAt(i);

            // Updating the count of each character in the map


            duplicate.put(ch, duplicate.getOrDefault(ch, 0) + 1);


        }

        // Iterating over the map to count characters that appeared more than once


        for (Map.Entry<Character, Integer> entry : duplicate.entrySet()) {


            if (entry.getValue() >= 2) {


                // Incrementing result for each character that occurs multiple times


                result++;


            }


        }

        // Returning the total count of distinct repeating characters


        return result;


    }

}
