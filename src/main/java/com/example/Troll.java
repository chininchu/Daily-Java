package com.example;


//TODO:Trolls are attacking your comment section!

//A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".


public class Troll {

    public static String disemvowel(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Checks is the character is not a vowel

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

                // Appends non-vowel characters

                stringBuilder.append(ch);


            }


        }

        // Returns the string without vowels


        return stringBuilder.toString();


    }


}
