package com.example;

public class JadenCase {

    public String toJadenCase(String phrase) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {

            char currentChar = phrase.charAt(i);

            stringBuilder.append(currentChar);

            char nextChar = (char) Character.toLowerCase(i + 1);







            if (Character.isWhitespace(currentChar)) {

                stringBuilder.append(nextChar);








            }






        }


        return stringBuilder.toString();

    }

}
