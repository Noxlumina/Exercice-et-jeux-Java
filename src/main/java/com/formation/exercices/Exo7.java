package com.formation.exercices;

import java.util.Scanner;

public class Exo7 {
    public void Exo7() {
    }

    /**
     * Méthode qui effectue la somme d'une liste de nombres
     */
    public void somme() {
        Integer result = 0;
        String affichage = "";

        System.out.println("Programme pour faire la somme");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("choisir un chiffre");
        Integer nbr = inputReader.nextInt();
        for (int i = 1; i <= nbr; i++) {
            result += i;
            if (i == nbr)
                affichage += i + "=";
            else
                affichage += i + "+";
        }
        System.out.println(affichage + result);
    }
}
