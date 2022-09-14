package com.formation.exercices;

import java.util.Scanner;

public class Exo8 {
    public void Exo8() {
    }

    /**
     * Méthode qui demande à un utilisateur un nombre puis qui construit visuellemnt
     * un escalier
     */
    public void escalier() {
        String affichage = "";

        System.out.println("Programme pour faire une pyramide");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("choisir un chiffre");
        Integer nbr = inputReader.nextInt();
        for (int i = 0; i <= nbr; i++) {
            affichage += "*";
            System.out.println(affichage);
        }
    }
}
