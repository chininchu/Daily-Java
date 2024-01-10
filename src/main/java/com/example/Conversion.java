package com.example;


// Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.
//
//Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public String solution(int n) {

        // Create a HasMap and store the Symbol as the Key and the value as the number.

        Map<Integer, Character> SymbolValue = new HashMap<>();

        SymbolValue.put(1, 'I');
        SymbolValue.put(5, 'V');
        SymbolValue.put(10, 'X');
        SymbolValue.put(50, 'L');
        SymbolValue.put(100, 'C');
        SymbolValue.put(500, 'D');
        SymbolValue.put(1000, 'M');

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, Character> entry : SymbolValue.entrySet()) {

            int key = entry.getKey();
            char value = entry.getValue();


        }


        return " ";


    }


}
