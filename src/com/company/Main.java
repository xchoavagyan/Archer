package com.company;

public class Main {

    public static void main(String[] args) {
        Archer archer1 = new Archer("archer1", 20, 2);
        Archer archer2 = new Archer("archer2", 25, 4);
        Archer archer3 = new Archer("archer3", 30, 6);
        Archer archer4 = new Archer("archer4", 50, 20);
        Archer archer5 = new Archer("archer5", 40, 25);
        Archer archer6 = new Archer("archer6", 30, 8);
        Archer archer7 = new Archer("archer7", 20, 1);

        boolean hit = false;
        while (!hit) {
            hit = archer1.shoot();
            System.out.println(archer1 + " " + hit);
            if (!hit) {
                hit = archer2.shoot();
                System.out.println(archer2 + " " + hit);
            }
            if (!hit) {
                hit = archer3.shoot();
                System.out.println(archer3 + " " + hit);
            }
            if (!hit) {
                hit = archer4.shoot();
                System.out.println(archer4 + " " + hit);
            }
            if (!hit) {
                hit = archer5.shoot();
                System.out.println(archer5 + " " + hit);
            }
            if (!hit) {
                hit = archer6.shoot();
                System.out.println(archer6 + " " + hit);
            }
            if (!hit) {
                hit = archer7.shoot();
                System.out.println(archer7 + " " + hit);
            }
            hit = true;
        }
    }
}
