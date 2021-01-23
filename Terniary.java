package com.company;

import java.util.Scanner;

public class Terniary {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        boolean tell;
        tell = num1 > 20 ? true : false;
        System.out.println(tell);
    }
}
