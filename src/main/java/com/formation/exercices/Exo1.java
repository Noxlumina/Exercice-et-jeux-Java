package com.formation.exercices;

import java.util.Scanner;

public class Exo1 {
    public void Exo1() {
    }

    /**
     * méthode qui permet de damander à un utilisateur son prénom puis de lui dire
     * Bonjour
     */
    public void bienvenue() {
        System.out.println("Comment t'appeles tu?");
        Scanner inputReader = new Scanner(System.in);
        String valeur = inputReader.next();
        System.out.println("Bienvenue " + valeur + " Que veux-tu?");
    }
}
