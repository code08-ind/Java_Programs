package com.company;

class Calc {
    float r;
    float pi = 3.14f;

    public void getArea() {
        System.out.println("Area Is : " + (pi * r * r));
    }

    public void getCircumference() {
        System.out.println("Circumference Is : " + (2 * pi * r));
    }
}

public class Circle {
    public static void main(String[] args) {
        Calc c2 = new Calc();
        c2.r = 3.42f;
        c2.getArea();
        c2.getCircumference();
    }
}
