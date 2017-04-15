package ru.itpark.work;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main  {

    public static void main(String[] args) throws Exception {
        Square square1 = new Square(4);
        Square square2 = new Square(3);
        Triangle triangle1 = new Triangle(5, 6, 8);
        Triangle triangle2 = new Triangle(5, 7, 6);

        OutputStream outputStream = new FileOutputStream("output.txt");
        String sq1= square1.toString(square1);
        String sq2 = square2.toString(square2);
        String tr1 = triangle1.toString(triangle1);
        String tr2 = triangle2.toString(triangle2);
        byte description1[] = sq1.getBytes();
        byte description2[] = sq2.getBytes();
        byte description3[] = tr1.getBytes();
        byte description4[] = tr2.getBytes();

        outputStream.write(description1);
        outputStream.write(description2);
        outputStream.write(description3);
        outputStream.write(description4);
    }
}
