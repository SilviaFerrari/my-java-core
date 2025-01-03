package com.SilviaFerrari.main.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Polygon {
    private final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount(){
        return vertices.length;
    }

    public double getPerimeter(){
        double perimeter = 0.0;
        int next;
        for(int i = 0; i < getVerticesCount(); i++){
            next = (i + 1) % vertices.length;
            perimeter += vertices[i].distance(vertices[next]);
        }
        return perimeter;
    }

    public double getArea(){
        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return Math.abs(area / 2.0);
    }

    public String toString(){
        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + '}';
    }
}
