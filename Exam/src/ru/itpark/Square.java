package ru.itpark;

/**
 * Created by Student11 on 08.04.2017.
 */
public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double area() {
        return a * a;
    }

    public double perimeter() {
        return 4 * a;
    }
}
