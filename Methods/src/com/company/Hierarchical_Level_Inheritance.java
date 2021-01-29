package com.company;

class mammals {
    void speak() {
        System.out.println("Animal Speaking ... ");
    }
}

class cats extends mammals {
    void meow() {
        System.out.println("Cat Is Doing Meow ... ");
    }
}

class dogs extends mammals {
    void bark() {
        System.out.println("Dog Is Barking ... ");
    }
}

public class Hierarchical_Level_Inheritance {
    public static void main(String[] args) {
        cats c1 = new cats();
        c1.speak();
        c1.meow();
//        c1.bark();//error in implementation
    }
}
