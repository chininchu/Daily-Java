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

public class DeadFish {

    public static int[] parse(String data) {

        int val = 0;

        for (int i = 0; i < data.length(); i++) {

            char ch = data.charAt(i);



            if(ch == 'i'){

                val += i;


            }






        }


        return null;

    }


}
