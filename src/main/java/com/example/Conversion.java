package com.example;


// Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.
//
//Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public String solution(int n) {


        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};

        StringBuilder stringBuilder = new StringBuilder();


        if (n >= 1 && n <= 3999) {


            String result = thousands[n / 1000] +
                    hundreds[(n % 1000) / 100] +
                    tens[(n % 100) / 10] +
                    ones[n % 10];


            stringBuilder.append(result);


        }

        return stringBuilder.toString();


    }


}
