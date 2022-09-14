package com.formation.jeux;

import java.util.Scanner;

public class Jeux1 {
    public void Jeux1() {
    }

    /**
     * Méthode du FIZZBUZZ en JAVA
     */
    public void FIZZBUZZ() {
        int nbr;
        System.out.println("Saissisez un nombre?");
        Scanner inputReader = new Scanner(System.in);
        nbr = inputReader.nextInt();
        for (int i = 0; i <= nbr ; i++) {
            if (i%15 == 0) System.out.println("FIZZBUZZ");
            else if (i%5 == 0) System.out.println("BUZZ");
            else if (i%3 == 0) System.out.println("FIZZ");
            else System.out.println(i);
        }
    }
}
