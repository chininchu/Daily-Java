package com.example;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {


        // 1 hour = 3600 seconds, 1 minute = 60 seconds
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int sec = remainingSeconds % 60;


        // Check if the seconds are within the expected range
        if (seconds <= 359999) {
            // Formatting the string to have two digits for hours, minutes, and seconds
            return String.format("%02d:%02d:%02d", hours, minutes, sec);
        } else {
            // Return null, an error message, or handle it as per your requirements
            return null;
        }


    }

}
