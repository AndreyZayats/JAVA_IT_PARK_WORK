package ru.itpark.work;


/**
 * Created by Student11 on 15.04.2017.
 */
public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private String name;

    public Triangle(String name, double a, double b, double c) {
        this.name = name;
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

    public String toString() {
        return  name + " Area: " + area() + " Perimeter: " + perimeter();
    }


}

