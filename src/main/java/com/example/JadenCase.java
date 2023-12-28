package com.example;

public class JadenCase {

    public String toJadenCase(String phrase) {

        // Check for null or empty input

        if (phrase == null || phrase.isEmpty()) {
            return null;

        }


        StringBuilder stringBuilder = new StringBuilder();


        // A flag that indicate whether to capitialize the next character

        boolean capitalizeNext = true;

        for (char currentChar : phrase.toCharArray()) {


            if (capitalizeNext && Character.isLetter(currentChar)) {

                // Capitialize this letter

                stringBuilder.append(Character.toUpperCase(currentChar));

                capitalizeNext = false;

            } else {

                stringBuilder.append(currentChar);


            }

            // If the current is a space, the next character should be capitialzed

            if (currentChar == ' ') {

                capitalizeNext = true;
            }


        }


        return stringBuilder.toString();

    }

}
