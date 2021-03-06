package ru.itpark.work;

import java.io.*;

public class Main  {

    public static String readNextLine(InputStream inputStream) throws Exception {
        String result = "";

        int character = inputStream.read();

        while (character != '\n') {
            result += (char) character;
            character = inputStream.read();
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        OutputStream outputStream = new FileOutputStream("output.txt");

        Square square1 = new Square("sq1", 4);
        Square square2 = new Square("sq2", 3);
        Triangle triangle1 = new Triangle("tr1", 5, 6, 8);
        Triangle triangle2 = new Triangle("tr2", 5, 7, 6);

        Object description[] = {square1, square2, triangle1, triangle2};

        for(int i = 0; i < description.length; i++) {
            outputStream.write((description[i].toString() + "\r\n").getBytes());
        }

        InputStream inputStream = new FileInputStream("output.txt");
        System.out.println(readNextLine(inputStream));
        System.out.println(readNextLine(inputStream));

        System.out.println();
    }
}
