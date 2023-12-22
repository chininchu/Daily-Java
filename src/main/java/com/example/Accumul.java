package com.example;

public class Accumul {


    public static String accum(String s) {

        // We will loop thru the String

        StringBuilder placeHolder = new StringBuilder(" ");

        for (char c : s.toCharArray()) {

            // Convert it into uppercase

            c = Character.toUpperCase(c);

            placeHolder.append(c + c);


        }

        return placeHolder.toString();


    }

}
