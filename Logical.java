package com.company;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        int maths;
        int physics;
        boolean a = true;
        boolean b = false;
        System.out.println(!a);
        System.out.println(!b);
        System.out.print("Enter Marks Of Maths And Physics : ");
        Scanner sc = new Scanner(System.in);
        maths = sc.nextInt();
        physics = sc.nextInt();
        if (maths >= 45 && physics > 78) {
            System.out.println("You Are Passed From Both Subjects.");
        } else if (maths <= 35 || physics > 35) {
            System.out.println("You Are Passes From One Subject.");
        } else {
            System.out.println("You Are Failed In Both The Subjects.");
        }
    }
}
