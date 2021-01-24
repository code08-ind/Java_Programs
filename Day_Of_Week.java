package com.company;

import java.util.Scanner;

public class Day_Of_Week {
    public static void main(String[] args) {
        int date;
        System.out.println("Enter Day Number Of Week : ");
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();
        switch (date) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("You Entered Invalid Day Number. Try Again!!!");
        }
    }
}
