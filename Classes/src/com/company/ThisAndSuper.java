package com.company;

class Base {
    int a;

    public int get() {
        return a;
    }

    Base() {
        a = 8;
    }

    Base(int a) {
        this.a = a;
    }
}

class Inherited extends Base {
    Inherited(int b) {
        super(b);
        System.out.println("Hello World");
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        Base b1 = new Base(45);
        Base b2 = new Base();
        Inherited i1 = new Inherited(64);
        System.out.println("Value Is : " + b2.a);
//        System.out.println("Value Real Is : " + b1.get());
    }
}
