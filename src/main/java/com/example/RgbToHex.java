package com.example;


// The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

public class RgbToHex {

    public static String rgb(int r, int g, int b) {


        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));


        // Convert each RGB component to a 2-digit hexadecimal string


        String redHex = String.format("%02X", r);
        String greenHex = String.format("%02X", g);
        String blueHex = String.format("%02X", b);

        // Concatenate the hexadecimal strings
        return "#" + redHex + greenHex + blueHex;


    }


}
