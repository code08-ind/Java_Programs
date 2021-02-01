package com.company;

class Employees {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String newName) {
        name = newName;
        return name;
    }
}

public class Practice1_Classes {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.name = "John";
        e1.salary = 12000;
        System.out.println("Name Of Person Is : " + e1.getName());
        System.out.println("Salary Of Person Is : " + e1.getSalary());
        System.out.println("New Name Of Person Is : " + e1.setName("James"));
    }
}
