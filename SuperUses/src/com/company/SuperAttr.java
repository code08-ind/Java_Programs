package com.company;

class Base {
    int x;

    Base(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    int x;

    Derived(int x, int y) {
        super(x);
        this.x = x;
    }

    void Display() {
        System.out.println("x = " + x + ", x of inherited class = " + x);
    }
}

public class SuperAttr {
    public static void main(String[] args) {
        Derived d = new Derived(4,5);
        d.Display();
    }
}
