package com.company;

import org.w3c.dom.css.Rect;

class Rectangle {
    int l, w;

    Rectangle() {
        l = 10;
        w = 12;
    }

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public void area() {
        System.out.println("Area Is : " + (l * w));
    }
}

public class RectangleConstructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        Rectangle r1 = new Rectangle(12,15);
        r1.area();
    }
}
