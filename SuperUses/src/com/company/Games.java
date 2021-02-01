package com.company;

class TommyVecetti {
    public void hitting() {
        System.out.println("Hitting ...");
    }

    public void running() {
        System.out.println("Running ...");
    }

    public void firing() {
        System.out.println("Firing ...");
    }
}

public class Games {
    public static void main(String[] args) {
        TommyVecetti t1 = new TommyVecetti();
        t1.hitting();
        t1.running();
        t1.firing();
    }
}
