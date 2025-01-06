package com.SilviaFerrari.main.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums){
        return nums.stream()
                .map(x -> x * 2)
                .filter(y -> y % 10 != 2)
                .collect(Collectors.toList());
    }
}
