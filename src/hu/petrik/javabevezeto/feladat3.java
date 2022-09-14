package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérek egy pozitiv valós számot: ");
        double szam=sc.nextDouble();
        double lefelekerekites= (int) Math.floor(szam);
        double felfelekerekites=Math.ceil(szam);
        double a=felfelekerekites-szam;
        double b=szam-lefelekerekites;

        if (b<a){
            System.out.printf("A megadott szám a %.1s és a %.1s egész számok között van, és ezek közül a %.1s számhoz van közelebb.",lefelekerekites,felfelekerekites,lefelekerekites);
        }
        else {
            System.out.printf("A megadott szám a %.1s és a %.1s egész számok között van, és ezek közül a %.1s számhoz van közelebb.",lefelekerekites,felfelekerekites,felfelekerekites);

        }

    }
}
