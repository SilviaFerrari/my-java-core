package com.SilviaFerrari.main.warmup;

import java.awt.*;

public class PointSwap {
    public static void swap(Point p1, Point p2){
        Point tmp = new Point(p1);
        p1.setLocation(p2);
        p2.setLocation(tmp);
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(10, 10);
        System.out.printf("Point a = (%f, %f)   Point b = (%f, %f)\n", p1.getX(), p1.getY(), p2.getX(), p2.getY());
        swap(p1, p2);
        System.out.printf("Point a = (%f, %f)   Point b = (%f, %f)\n", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
