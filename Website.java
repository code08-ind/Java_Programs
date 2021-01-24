package com.company;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        String web;
        System.out.println("Enter The Site You Want To Search For : ");
        Scanner sc = new Scanner(System.in);
        web = sc.next();
        if (web.endsWith(".com")) {
            System.out.println("This Is Commercial Site.");
        } else if (web.endsWith(".org")) {
            System.out.println("This Is Organisational Site.");
        } else if (web.endsWith(".edu")) {
            System.out.println("This Is Educational Site");
        } else {
            System.out.println("Please Enter Correct Format.");
        }
    }
}
