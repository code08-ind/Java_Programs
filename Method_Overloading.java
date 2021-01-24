package com.company;

class Demo {
    void print() {
        System.out.println("Hello World");
    }

    void print(String name) {
        System.out.println("Hello " + name);
    }

    void print(int a, int b) {
        System.out.println("Sum Of Given Two Numbers Is " + (a + b));
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Demo dm = new Demo();
        dm.print();
        dm.print("John");
        dm.print(12,13);
    }
}
