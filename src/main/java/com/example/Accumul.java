package com.example;


// TODO: This time no story, no theory. The examples below show you how to write function accum: Examples:

// TODO: accum("abcd") -> "A-Bb-Ccc-Dddd"
// TODO: accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//TODO: accum("cwAt") -> "C-Ww-Aaa-Tttt"

public class Accumul {




    public static String accum(String s) {

        // We will loop thru the String

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Append the upper version of the character
            result.append(Character.toUpperCase(currentChar));


            for (int j = 0; j < i; j++) {

                //Append the lowercase version to the current version which is "i"


                result.append(Character.toLowerCase(currentChar));

            }

            if (i < s.length() - 1) {

                result.append("-");


            }


        }

        return result.toString();


    }

}
