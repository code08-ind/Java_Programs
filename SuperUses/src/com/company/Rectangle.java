package com.company;

class Inform {
    int length;
    int width;

    public void getArea() {
        System.out.println("Area Is : " + (length * width));
    }

    public void getPerimeter() {
        System.out.println("Perimeter Is : " + (2 * (length + width)));
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Inform i2 = new Inform();
        i2.length = 12;
        i2.width = 15;
        i2.getArea();
        i2.getPerimeter();
    }
}
