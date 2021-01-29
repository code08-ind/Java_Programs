package com.company;

class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("Bye");
    }
}

public class Multiple_Inheritance extends A {//cannot Extend Multiple classes
    public static void main(String[] args) {
        Multiple_Inheritance m1 = new Multiple_Inheritance();
        m1.msg();
    }
}
