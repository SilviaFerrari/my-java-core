package com.SilviaFerrari.main.oop.basic;

import java.awt.*;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public boolean contains(Point point){
        return center.distance(point) < radius;
    }

    public void translate(int dx, int dy){
        center.translate(dx, dy);
    }

    public String toString(){
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}
