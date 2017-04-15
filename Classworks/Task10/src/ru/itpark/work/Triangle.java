package ru.itpark.work;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Student11 on 15.04.2017.
 */
public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    public String toString(Triangle triangle) {
        return  triangle.getClass().getSimpleName() + " Area: " + area() + " Perimeter: " + perimeter() + "\r\n";
    }
}

