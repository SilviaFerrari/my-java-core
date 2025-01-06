package com.SilviaFerrari.main.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists){
        List<List<String>> filteredLists = new ArrayList<>();
        for (List<String> list : lists) {
            try{
                for (String s : list) {
                    CheckString.checkString(s);
                }
                filteredLists.add(list);
            } catch (ParseException ignored){}
        }
        return filteredLists;
    }
}
