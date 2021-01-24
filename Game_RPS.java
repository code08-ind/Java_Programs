package com.company;

import java.util.Scanner;
import java.util.Random;

public class Game_RPS {
    public static void main(String[] args) {
        int choice;
        int compChoice;
        System.out.println("Enter Your Choice");
        System.out.println("1 Is For Rock");
        System.out.println("2 Is For Paper");
        System.out.println("3 Is For Scissor");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        Random rm = new Random();
        compChoice = 1 + rm.nextInt(3);
        System.out.println("Computer's Choice Is " + compChoice);
        if (choice == 1 && compChoice == 2) {
            System.out.println("Computer Won The Game");
        } else if (choice == 2 && compChoice == 3) {
            System.out.println("Computer Won The Game");
        } else if (choice == 3 && compChoice == 1) {
            System.out.println("Computer Won The Game");
        } else if (choice == 3 && compChoice == 2) {
            System.out.println("You Won The Game");
        } else if (choice == 2 && compChoice == 1) {
            System.out.println("You Won The Game");
        } else if (choice == 1 && compChoice == 3) {
            System.out.println("You Won The Game");
        } else {
            System.out.println("Game Got Tied");
        }
    }
}
