package com.company;

class Employees {
    private int age;
    private int salary;
    private String name;

    public Employees() {
        age = 12;
        salary = 12000;
        name = "John";
    }

    public Employees(int a, int s, String n) {
        age = a;
        salary = s;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        Employees e2 = new Employees(14, 14000, "Steve");
        System.out.println();
        System.out.println("Name Is : " + e1.getName());
        System.out.println("Age Is : " + e1.getAge());
        System.out.println("Salary Is : " + e1.getSalary());
        System.out.println();
        System.out.println("Name Is : " + e2.getName());
        System.out.println("Age Is : " + e2.getAge());
        System.out.println("Salary Is : " + e2.getSalary());
    }
}
