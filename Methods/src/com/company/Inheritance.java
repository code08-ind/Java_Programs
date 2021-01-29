package com.company;

class base {
    int i, j;

    void print() {
        System.out.println("First Value Is : " + i);
    }

    void printVal() {
        System.out.println("Second Value Is : " + j);
    }
}

class inherited extends base {
    int k;

    void last() {
        System.out.println("Third Value Is : " + k);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        base b = new base();
        inherited i1 = new inherited();
        b.i = 4;
        b.j = 5;
        b.print();
        b.printVal();
        i1.i = 6;
        i1.j = 7;
        i1.k = 8;
        i1.print();
        i1.printVal();
        i1.last();
    }
}
