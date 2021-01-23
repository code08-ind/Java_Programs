package com.company;

import java.util.Scanner;

public class Shift_Operators {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        int num3;
        num3 = num1>>2;
        System.out.println(num3);
        byte num2;
        num2 = (byte) ((byte) num1<<2);
        System.out.println(num2);
    }
}
