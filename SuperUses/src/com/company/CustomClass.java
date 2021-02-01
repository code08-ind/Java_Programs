package com.company;

class Employee {
    int a = 9;
    String s1 = "John Mathews";

    public void print() {
        System.out.println("My Age Is : " + a);
        System.out.println("My Name Is : " + s1);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Employee e1 = new Employee();
        System.out.println(e1.a);
        System.out.println(e1.s1);
        e1.print();
    }
}
