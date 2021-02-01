package com.company;

class Info {
    int side;

    public void getArea() {
        System.out.println("Area Is : " + (side * side));
    }

    public void getPerimeter() {
        System.out.println("Perimeter Is : " + (4 * side));
    }
}

public class Square {
    public static void main(String[] args) {
        Info i1 = new Info();
        i1.side = 12;
        i1.getArea();
        i1.getPerimeter();
    }
}
