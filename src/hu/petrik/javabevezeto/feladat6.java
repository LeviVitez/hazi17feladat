package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérem a dolgozat százalékát (0-100): ");
        int dolgozat_százalék = sc.nextInt();
        if (dolgozat_százalék>=88){
            System.out.println("Jeles");
            System.exit(0);
        }
        if (dolgozat_százalék>=73 && dolgozat_százalék<88){
            System.out.println("jó");
            System.exit(0);
        }
        if (dolgozat_százalék>=58 && dolgozat_százalék<73){
            System.out.println("közepes");
            System.exit(0);
        }
        if (dolgozat_százalék>=43 && dolgozat_százalék<58){
            System.out.println("elégséges");
            System.exit(0);
        }
        if (dolgozat_százalék>=0 && dolgozat_százalék<42){
            System.out.println("elégtelen");
            System.exit(0);
        }
    }
}
