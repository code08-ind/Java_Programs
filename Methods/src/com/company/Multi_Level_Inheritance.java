package com.company;

class pisces {
    void get() {
        System.out.println("Hello World");
    }
}

class fish extends pisces {
    void set() {
        System.out.println("Hello");
    }
}

class whale extends fish {
    void met() {
        System.out.println("Bye");
    }
}

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        whale w1 = new whale();
        w1.get();
        w1.set();
        w1.met();
    }
}
