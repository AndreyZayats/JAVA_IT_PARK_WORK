package ru.itpark.work;

/**
 * Created by Student11 on 15.04.2017.
 */
public class Square implements Figure {
    private double a;
    private String name;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public double area() {
        return a * a;
    }

    public double perimeter() {
        return 4 * a;
    }

    public String toString() {
        return name + " Area: " + area() + " Perimeter: " + perimeter();
    }
}
