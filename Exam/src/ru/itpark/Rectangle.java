package ru.itpark;

/**
 * Created by Student11 on 08.04.2017.
 */
public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return (a + b) / 2;
    }
}
