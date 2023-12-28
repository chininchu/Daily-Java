package com.example;

public class JadenCase {

    public String toJadenCase(String phrase) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {

            char currentChar = phrase.charAt(i);


            if (i == 0) {

                stringBuilder.append(currentChar);


            }else if (currentChar == Character.toUpperCase(currentChar)) {


                char lowerCase = Character.toLowerCase(currentChar);
                stringBuilder.append(lowerCase);

            } else {

                stringBuilder.append(currentChar);


            }


        }


        return stringBuilder.toString();

    }

}
