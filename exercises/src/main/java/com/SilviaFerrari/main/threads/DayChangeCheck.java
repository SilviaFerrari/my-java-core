package com.SilviaFerrari.main.threads;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class DayChangeCheck extends Thread {

    public void run() {
        System.out.println(getName() + " started at " + LocalDate.now());
        while(!interrupted()) {
            LocalDate initialDate = LocalDate.now();
            try{
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));
            }
            catch (InterruptedException ignored) {}

            LocalDate currentDate = LocalDate.now();
            if(initialDate.getDayOfMonth() != currentDate.getDayOfMonth()) {
                System.out.println(initialDate + " has changed and now is " + LocalDate.now());
            }
        }
        System.out.println(getName() + " terminated");
    }

    public static void main(String[] args) {
        DayChangeCheck dayChangeCheck = new DayChangeCheck();
        dayChangeCheck.start();
        // il main termina subito senza aspettere i figli
        // da non fare mai!
    }
}
