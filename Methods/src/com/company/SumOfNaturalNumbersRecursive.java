package com.company;

import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {
    static int result(int n) {
        if (n == 1) {
            return 1;
        }
        else{
            return result(n-1)+n;
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter The Number Till You Want Sum Of Natural Numbers : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Sum Till Number N Is : " + result(num));
    }
}
