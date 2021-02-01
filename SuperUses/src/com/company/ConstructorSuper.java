package com.company;

class C {
    int a;
    C(int a) {
        this.a = a;
        System.out.println("Constructor Of Class C Called.");
    }
    public int get(){
        return a;
    }
}

class D extends C {
    D(int b) {
        super(b);
        System.out.println("Constructor Of Class D Called.");
    }
}

public class ConstructorSuper {
    public static void main(String[] args) {
        C c1 = new C(23);
        D d1 = new D(64);
        System.out.println("Value Is : " + c1.a);
    }
}
