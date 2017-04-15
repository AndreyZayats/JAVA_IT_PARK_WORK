package ru.itpark.work;

/**
 * Created by Student11 on 15.04.2017.
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

    public String toString(Square square) {
        return square.getClass().getSimpleName() + " Area: " + area() + " Perimeter: " + perimeter() + "\r\n";
    }
}
