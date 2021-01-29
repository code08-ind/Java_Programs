package com.company;

public class Main {
    int logic(int i, int j) {//method is static as we can use any copy without creating an object
        int z;
        if (i > j) {
            z = i * j;
        } else {
            z = i + j;
        }
        return z;
    }

    public static void main(String[] args) {
        // write your code here
        int a = 2;
        int b = 4;
        int c;
        Main m1 = new Main();
        c = m1.logic(a, b);
        System.out.println(c);
    }
}
