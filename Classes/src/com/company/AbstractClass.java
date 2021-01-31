package com.company;

abstract class C {
    C() {
        System.out.println("Constructor Of Class C Called");
    }

    abstract void bets();

    public void print() {
        System.out.println("Hello World");
    }

    public void gets() {
        System.out.println("Hello James");
    }
}

class D extends C {
    D() {
        System.out.println("Constructor Of Class D Called");
    }

    public void bets() {
        System.out.println("Bye Bye");
    }

    public void sets() {
        System.out.println("Ta Ta");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        C c1 = new D();
        c1.bets();
        c1.print();
        c1.gets();
        D d1 = new D();
        d1.bets();
        d1.sets();
        d1.gets();
        d1.print();
    }
}
