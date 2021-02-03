package com.company;

class Input {
    float r;
    float h;
    float pi = 3.14f;

    Input(float r2, float h2) {
        r = r2;
        h = h2;
    }

    Input(float r3){
        r = r3;
    }

    public float getR() {
        return r;
    }

    public void setR(int r1) {
        r = r1;
    }

    public float getH() {
        return h;
    }

    public void setH(int h1) {
        h = h1;
    }

    public void surfaceArea() {
        System.out.println("Surface Area Is : " + ((2 * pi * r * r) + (4 * pi * r * h)));
    }

    public void volume() {
        System.out.println("Volume Is : " + ((pi * r * r * h)));
    }
}

public class Cylinder {
    public static void main(String[] args) {
        Input i1 = new Input(12.5f, 14.3f);
        Input i2 = new Input(12.5f);
//        i1.setR(12);
//        i1.setH(13);
        System.out.println(i1.getR());
        System.out.println(i2.getR());
        System.out.println(i1.getH());
        i1.surfaceArea();
        i1.volume();
    }
}
