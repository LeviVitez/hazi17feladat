package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérek a hónap számát: ");
        int honapszam = sc.nextInt();
        if (honapszam>=1 && honapszam<3 || honapszam==12){
            System.out.println("tél");
            System.exit(0);
        }
        if (honapszam>=3 && honapszam<6){
            System.out.println("tavasz");
            System.exit(0);
        }
        if (honapszam>=6 && honapszam<9){
            System.out.println("nyár");
            System.exit(0);
        }
        if (honapszam>=9 && honapszam<12){
            System.out.println("ősz");
            System.exit(0);
        }
    }
}
