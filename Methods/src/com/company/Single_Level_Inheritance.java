package com.company;
class animals{
    void speak(){
        System.out.println("Animal Speaks");
    }
}
class dog extends animals{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public class Single_Level_Inheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.speak();
        d1.bark();
    }
}
