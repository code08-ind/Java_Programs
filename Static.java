package com.company;
class Demos{
    static Demos d1;
    static int a = 45;
    static int b =56;
    static void print(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Static {
    public static void main(String[] args) {
        Demos.print();
    }
}
