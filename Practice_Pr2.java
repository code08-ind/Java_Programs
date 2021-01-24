package com.company;

import java.util.Scanner;

public class Practice_Pr2 {
    public static void main(String[] args) {
        int total;
        int maths;
        int physics;
        int chemistry;
        int total_per;
        System.out.println("Enter Marks Of 3 Subjects : ");
        Scanner sc = new Scanner(System.in);
        maths = sc.nextInt();
        physics = sc.nextInt();
        chemistry = sc.nextInt();
        total = maths + physics + chemistry;
        total_per = total * 100/300;
        if ((total_per >= 40) && (maths >= 33 && physics >= 33 && chemistry >= 33)) {
            System.out.println("You Are Passed.");
        } else {
            System.out.println("You Are Failed.");
        }
    }
}
