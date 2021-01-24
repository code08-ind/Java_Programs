package com.company;
class Stat{
    int a;
    static int b;
    static void print(){
        System.out.println("Static Method");
    }
}
public class Final_Static {
    public static void main(String[] args) {
        Stat s1 = new Stat();
        Stat s2 = new Stat();
        s1.a = 12;
        s1.b = 10;
        s2.a = 14;
        s2.b = 15;
        System.out.println(s1.a);
        System.out.println(s1.b);
        System.out.println(s2.a);
        System.out.println(s2.b);
    }
}
