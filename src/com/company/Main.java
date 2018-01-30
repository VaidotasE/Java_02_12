package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ivesk svori KG: ");
        float svoris = sc.nextFloat();
        System.out.println("Ivesk ugi m; ");
        float ugis = sc.nextFloat();

        KMISkaiciavimas skaiciavimas = new KMISkaiciavimas(svoris, ugis);

        float KMI = skaiciavimas.skaiciuokKMI(svoris, ugis);

        System.out.println("KMI: " + KMI);
    }
}
