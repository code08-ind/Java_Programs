package com.company;

import java.util.Scanner;

class Fact {
    int num;

    int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            num = fact(n - 1) * n;
            return num;
        }
    }
}

public class Recursion {
    public static void main(String[] args) {
        Fact fact1 = new Fact();
        System.out.println("Enter The Number Whose Factorial You Need To Find : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int test = fact1.fact(num1);
        System.out.println("Factorial Of Given Number : " + test);
    }
}
