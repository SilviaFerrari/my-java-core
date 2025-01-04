package com.SilviaFerrari.main.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
    public static List<Long> lookAndSay(long n){
        if(n < 1){
            return new ArrayList<>();
        }

        List<Long> sequence = new ArrayList<>(List.of(1L));
        StringBuilder item = new StringBuilder();
        String prev = "1";

        for(int i = 1; i < n; i++){
            char current = prev.charAt(0);
            int counter = 1;

            for(int index = 1; index < prev.length(); index++){
                if(prev.charAt(index) == current){
                    counter++;
                } else{
                    item.append(counter).append(current);
                    current = prev.charAt(index);
                    counter = 1;
                }
            }
            item.append(counter).append(current);
            sequence.add(Long.parseLong(item.toString()));
            prev = item.toString();
            item.delete(0, item.length());
        }
        return sequence;
    }
}
