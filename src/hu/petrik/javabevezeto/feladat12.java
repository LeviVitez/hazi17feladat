package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy összeget: (min 1, max 1000)");
        double beutottosszeg = sc.nextDouble();
        double osszeg= beutottosszeg;
        if (osszeg>1000 ){
            System.out.println("a megadott összeg nagyobb mint 1000");
            System.exit(0);
        }
        if (osszeg<1 ){
            System.out.println("a megadott összeg kisebb mint 1");
            System.exit(0);
        }
        int penz200 = 0;
        int penz100 = 0;
        int penz50 = 0;
        int penz20 = 0;
        int penz10 = 0;
        int penz5 = 0;
        boolean hibas=false;
        while (osszeg != 0 && osszeg<=1000) {
            if (osszeg >= 200) {
                penz200++;
                osszeg = osszeg - 200;

            } else if (osszeg < 200 && osszeg >= 100) {
                penz100++;
                osszeg = osszeg - 100;

            } else if (osszeg < 100 && osszeg >= 50) {
                penz50++;
                osszeg = osszeg - 50;

            } else if (osszeg < 50 && osszeg >= 20) {
                penz20++;
                osszeg = osszeg - 20;

            } else if (osszeg < 20 && osszeg >= 10) {
                penz10++;
                osszeg = osszeg - 10;

            } else if (osszeg < 10 && osszeg >= 5) {
                penz5++;
                osszeg = osszeg - 5;
            } else {
                hibas=true;
                break;
            }
        }
        if (hibas){
            System.out.println("Adjon meg vagy egészre vagy 5- re végződő számjegyet!");
        }else {
            System.out.println(beutottosszeg + " Ft- ot legkevesebb erméből " + penz200 + " 200-asból " + penz100 + " 100-asból "
                    + penz50 + " 50-esből " + penz20 + " 20-asból " + penz10 + " 10-esből " + penz5 + " 5-ösből " + "-ből lehet összeálítani.");
        }



    }
}
