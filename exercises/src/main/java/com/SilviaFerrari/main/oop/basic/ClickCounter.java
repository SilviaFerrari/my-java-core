package com.SilviaFerrari.main.oop.basic;

public class ClickCounter {
    private int value = 0;

    public int getValue(){
        return value;
    }

    public void click(){
        value++;
    }

    public void undo(){
        if(value > 0){
            value--;
        }
    }
    public void reset(){
        value = 0;
    }
}
