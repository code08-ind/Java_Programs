package com.company;

class New {
    int l, w, d;

    New() {
        l = 10;
        w = 10;
        d = 10;
    }

    New(int l, int w, int d) {
        this.l = l;
        this.w = w;
        this.d = d;
    }

    void calculate(int l, int w, int d) {
        System.out.println("Volume Of Box Is : " + (l * w * d));
    }

    void calculate(int l, int w) {
        System.out.println("Area Of Box's Front Face Is : " + (l * w));
    }
}

public class Overloading {
    public static void main(String[] args) {
        New n1 = new New();
        New n2 = new New(12, 12, 12);
        n1.calculate(10, 10, 10);
        n1.calculate(10, 10);
        n2.calculate(12, 12, 12);
        n1.calculate(12, 12);

    }
}
