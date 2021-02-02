package com.company;

class Employee {
    private int a;
    private String name;

    public int getA() {
        return a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }
}

public class AccessModifiers {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setA(12);
        e1.setName("John");
        System.out.println("Age Is : " + e1.getA());
        System.out.println("Name Is : " + e1.getName());
    }
}
