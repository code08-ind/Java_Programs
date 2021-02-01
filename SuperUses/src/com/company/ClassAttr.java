package com.company;

class Veg {
    protected String type = "Veg";
}

class Fruit extends Veg {
    public String type = "Fruit";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

public class ClassAttr {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.printType();
    }
}
