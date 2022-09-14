package com.formation.exercices;

import java.util.Scanner;

public class Exo9 {
    public void Exo9() {
    }

    /**
     * Méthode qui construit une pyramide verticalement à partir d'un nombre demandé
     * à un utilisateur
     */
    public void pyramide() {
        String affichage = "";
        int i;
        int j;

        System.out.println("Programme pour faire une pyramide");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("choisir un chiffre");
        Integer nbr = inputReader.nextInt();
        for (i = 0; i < nbr; i++) {
            affichage += "*";
            System.out.println(affichage);
        }

        for (i = nbr; i > 0; i--) {
            affichage = "";
            for (j = 0; j < (i - 1); j++) {
                affichage += "*";
            }
            System.out.println(affichage);
        }
    }
}
