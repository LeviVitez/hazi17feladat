package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat13 {
    public static void main(String[] args) {
        int randomszam = (int) (Math.random() * 100) + 1;
        System.out.println("Tippelje meg a számot 1 és 100 között:");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        while (tipp != randomszam) {
            if (randomszam - tipp > 0) {
                System.out.println("A tippelt érték nagyobb a számnál! Tippelj újra! ");
                tipp = sc.nextInt();
            } else if (randomszam - tipp < 0) {
                System.out.println("A tippelt érték kisebb a számnál! Tippelj újra! ");
                tipp = sc.nextInt();
            }
        }
        System.out.println("Elataláltad! A szám a(z) " + randomszam + " volt!");

    }
}
