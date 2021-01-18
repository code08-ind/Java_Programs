package com.company;

class Room {
    int width;
    int height;
    int depth;

    Room() {
        width = 12;
        height = 10;
        depth = 15;
    }

    Room(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    void volume() {
        System.out.println("Volume Of Room Is : " + (width * height * depth));
    }

    int area() {
        return (2 * (width * height + width * depth + depth * height));
    }
}

public class RoomDemo {
    public static void main(String[] args) {
        Room room1 = new Room();
        Room room2 = new Room(10, 10, 10);
        Room room3 = room1;
        int ar;
        ar = room1.area();
        room1.volume();
        System.out.println("Area Of The Room Is : " + ar);
        ar = room2.area();
        room2.volume();
        System.out.println("Area Of The Room Is : " + ar);
        ar = room3.area();
        room3.volume();
        System.out.println("Area Of The Room Is : " + ar);
    }
}
