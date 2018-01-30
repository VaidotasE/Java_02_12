package com.company;

public class KMISkaiciavimas {
    public KMISkaiciavimas(float svoris, float ugis){
        System.out.println(svoris + " " + ugis);
    }
    public float skaiciuokKMI(float svoris, float ugis){
        return svoris/(ugis*ugis);
    }
}
