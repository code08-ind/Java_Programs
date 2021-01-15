package com.company;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter The Marks Of Student One By One");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks Of Maths Out Of 100 : ");
        float maths = sc.nextFloat();
        System.out.println("Enter The Marks Of Physics Out Of 100 : ");
        float phy = sc.nextFloat();
        System.out.println("Enter The Marks Of Chemistry Out Of 100 : ");
        float chem = sc.nextFloat();
        System.out.println("Enter The Marks Of Biology Out Of 100 : ");
        float bio = sc.nextFloat();
        System.out.println("Enter The Marks Of SocialStudies Out Of 100 : ");
        float sst = sc.nextFloat();
        float total = maths + phy + chem + bio + sst;
        System.out.println("Total Marks Of Student Is : " + total);
        float percentage = (total / 500) * 100;
        System.out.println("Percentage Of Student Is : " + percentage);
    }
}
