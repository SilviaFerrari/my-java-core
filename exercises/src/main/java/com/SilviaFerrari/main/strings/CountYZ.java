package com.SilviaFerrari.main.strings;

import java.util.StringTokenizer;

public class CountYZ {
    public static int countYZ(String s) {
        int counter = 0;
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            String token = st.nextToken().toLowerCase();
            if(token.endsWith("y") || token.endsWith("z")) {
                counter++;
            }
        }
        return counter;
    }
}
