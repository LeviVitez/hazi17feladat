package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérem a Terület szélességét (Méterben): ");
        int szelesseg=sc.nextInt();
        System.out.println("Kérem a Terület magasságát (Méterben): ");
        int magassag=sc.nextInt();
        int terulet= (szelesseg*100)*(magassag*100);
        int csempeterulete= 20*20;
        int csempedbszam=terulet/csempeterulete;
        double vegsocsempeszam=(double) csempedbszam/100;
        vegsocsempeszam=vegsocsempeszam*10;
        vegsocsempeszam=vegsocsempeszam+csempedbszam;
        System.out.printf("A munkásoknak %.1f csempére van szüksége",vegsocsempeszam);
    }
}
