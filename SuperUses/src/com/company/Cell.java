package com.company;

class CellPhone {
    public void ring() {
        System.out.println("Ringing ...");
    }

    public void vibrate() {
        System.out.println("Vibrating ...");
    }
}

public class Cell {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        c1.ring();
        c1.vibrate();
    }
}
