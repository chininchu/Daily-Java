package com.example;

// Write a simple parser that will parse and run Deadfish.
//
//Deadfish has 4 commands, each 1 character long:
//
//i increments the value (initially 0)
//d decrements the value
//s squares the value
//o outputs the value into the return array
//Invalid characters should be ignored.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeadFish {

    public static int[] parse(String data) {

        int val = 0;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 0; i < data.length(); i++) {

            char ch = data.charAt(i);


            if (ch == 'i') {

                val++;


            } else if (ch == 'd') {


                val--;

            } else if (ch == 's') {


                val = (int) Math.pow(val, 2);


            } else if (ch == 'o') {

                arrayList.add(val);


            }


        }


        // Convert ArrayList to int[]

        int[] array = new int[arrayList.size()];


        for (int i = 0; i < arrayList.size(); i++) {

            array[i] = arrayList.get(i);


        }

        return array;


    }


}
