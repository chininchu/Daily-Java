package com.example;

//Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.


import java.util.Arrays;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < numbers.length; i++) {


            if (i == 0) {

                result.append("(");


            }


            result.append(numbers[i]);


        }


        return null;


    }


}
