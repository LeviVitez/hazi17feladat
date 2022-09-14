package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot: ");
        int a = sc.nextInt();
        int ossz = 0;
        for (int i = 0; i < a; i++) {
            if (i <= a && i % 2 != 0) {
                ossz = ossz + i;
            }
        }
        System.out.println(ossz);
    }
}