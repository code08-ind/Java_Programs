package com.company;

public class Break_Continue {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Bye");
//            if (i == 2) {
//                System.out.println("Hello");
//                break;
//            }
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Bye");
            if (i == 2) {
                System.out.println("Hello");
                continue;
            }
            System.out.println("Ta Ta");
        }
    }
}
