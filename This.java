package com.company;

class Boxes {
    int l, w, h;

    Boxes(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    int volume() {
        return l * w * h;
    }
}

public class This {
    public static void main(String[] args) {
        Boxes b1 = new Boxes(10, 10, 10);
        int vol;
        vol = b1.volume();
        System.out.println("Volume Of Box Is : " + vol);
    }
}
