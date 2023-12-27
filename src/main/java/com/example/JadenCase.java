package com.example;

public class JadenCase {

    public String toJadenCase(String phrase) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {

            char ch = phrase.charAt(i);

            if (ch == ' ') {

                char lowerCase = (char) Character.toLowerCase(ch);

                stringBuilder.append(lowerCase);

            }


        }


        return stringBuilder.toString();

    }

}
