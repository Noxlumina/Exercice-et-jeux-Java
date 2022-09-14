package com.formation.exercices;

import java.util.Scanner;

public class Exo10 {
    public void Exo10() {
    }

    /**
     * Méthode qui construit une pyramide à partir d'un nombre demandé à un
     * utilisateur
     */
    public void truePyramide() {
        String etoile = "";
        String espace = " ";
        String affichage = "";
        Scanner inputReader = new Scanner(System.in);

        System.out.println("choisir un chiffre");
        Integer valeur = inputReader.nextInt();
        for (int i = 1; i < valeur; i++) {
            if (i == 1) {
                etoile = "*";
                espace = "                              ";
                affichage = espace + etoile;
                System.out.println(affichage);
            } else {
                // etoile += " *";
                etoile += "**";
                Integer entierMoins = espace.length() - 1;
                espace = espace.substring(0, entierMoins);
                affichage = espace + etoile;
                System.out.println(affichage);
            }
        }
    }
}
