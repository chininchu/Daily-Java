package com.example;


import java.util.*;
import java.util.function.BinaryOperator;

public class ASum {

    public static long findNb(long m) {

        long sum = 0;
        long n = 0;

        while (sum < m) {

            n++;
            sum += n * n * n;


        }

        if (sum == m) {
            return n;


        } else {

            return -1;


        }


    }


}
