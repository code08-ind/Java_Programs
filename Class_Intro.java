package com.company;

class Box {
    int w;
    int h;
    int d;

    Box() {
        w = 10;
        h = 10;
        d = 10;
    }

    Box(int w, int h, int d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    Box(Box b) {
        this.w = b.w;
        this.h = b.h;
        this.d = b.d;
    }

    int volume() {
        return w * h * d;
    }

    int area(int a, int b, int c) {
        this.w = a;
        this.h = b;
        this.d = c;
        return 2 * (w * h + h * d + d * w);
    }
}

public class Class_Intro {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(12, 12, 12);
        Box box3 = new Box(box1);
        Box box4 = box2;
        int vol = box1.volume();
        int vol1 = box2.volume();
        int vol2 = box3.volume();
        int vol3 = box4.volume();
        int ar1 = box1.area(10, 10, 10);
        System.out.println("Volume Of Box : " + vol);
        System.out.println("Volume Of Box : " + vol1);
        System.out.println("Volume Of Box : " + vol2);
        System.out.println("Volume Of Box : " + vol3);
        System.out.println("Area Of Box : " + ar1);
    }
}
