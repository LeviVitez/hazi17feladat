package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tomb1[]=new int[]{12,2,3,43,5};
        int tomb2[]=new int[]{53,4,33,2,11};
        for (int i = 0; i < tomb1.length; i++) {
            System.out.printf("%s\n",tomb1[i]);
        }
        System.out.println("melyik elemet akarja összeadni melyikkel? (0-4)");
        int szam1=sc.nextInt();
        for (int i = 0; i < tomb2.length; i++) {
            System.out.printf("%s\n",tomb2[i]);
        }
        int szam2=sc.nextInt();

        int tomb3[]=new int[]{tomb1[szam1]+tomb2[szam2]};
        System.out.println(tomb3[0]);



    }
}
