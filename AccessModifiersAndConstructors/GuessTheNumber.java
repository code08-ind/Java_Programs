package com.company;

import java.util.Scanner;
import java.util.Random;

class Game {
    int x;
    int input;
    int guesses = 0;

    Game() {
        Random rm = new Random();
        x = 1 + rm.nextInt(100);
    }

    public void input() {
        System.out.println("Enter The Input Number Between 1 To 100 : ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    public boolean isCorrect() {
        if (x == input) {
            System.out.println("Congratulations! The Number You Entered Was Correct!");
            return true;
        } else if (x > input) {
            System.out.println("The Number You Entered Was Small !Try Again!");
            guesses++;
        } else {
            System.out.println("The Number You Entered Was Large !Try Again!");
            guesses++;
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g1 = new Game();
        boolean b1 = false;
        while (!b1) {//if it is false then
            g1.input();
            b1 = g1.isCorrect();//if ti becomes true then end the loop
        }
        System.out.println("Number Of Guesses You Took Are : " + (g1.guesses+1));
    }
}
