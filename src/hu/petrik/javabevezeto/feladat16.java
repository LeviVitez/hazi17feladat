package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat16 {
    public static void main(String[] args) {
        double tomb[]=new double[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérek 5 számot a tömb-be: ");
        double tomb1 = sc.nextDouble();
        tomb[0]=tomb1;
        double tomb2 = sc.nextDouble();
        tomb[1]=tomb2;
        double tomb3 = sc.nextDouble();
        tomb[2]=tomb3;
        double tomb4 = sc.nextDouble();
        tomb[3]=tomb4;
        double tomb5 = sc.nextDouble();
        tomb[4]=tomb5;

        for (int i = 0; i <tomb.length ; i++) {
            System.out.printf("%.1s\n",tomb[i]);
        }
        System.out.println(" ");
        System.out.printf("%.1s\n",tomb[4]);
        System.out.printf("%.1s\n",tomb[3]);
        System.out.printf("%.1s\n",tomb[2]);
        System.out.printf("%.1s\n",tomb[1]);
        System.out.printf("%.1s\n",tomb[0]);
        System.out.println(" ");

        boolean masodik=true;

        for (int i = 0; i < tomb.length; i++) {
            if (masodik==false){
                System.out.printf("%.1s\n",tomb[i]);
                masodik=true;
            }
            else {
                masodik=false;
            }
        }

        System.out.println("kérek 1-5-ig egy számot: ");
        double szam=sc.nextDouble();
        if (szam==5){
            System.out.printf("%.1s\n",tomb[4]);
        }
        if (szam==4){
            System.out.printf("%.1s\n",tomb[3]);
        }
        if (szam==3){
            System.out.printf("%.1s\n",tomb[2]);
        }
        if (szam==2){
            System.out.printf("%.1s\n",tomb[1]);
        }
        if (szam==1){
            System.out.printf("%.1s\n",tomb[0]);
        }

    }
}
