package com.formation.exercices;

import java.util.Scanner;

public class Exo2 {
    public void Exo2() {
    }

    /**
     * Méthode qui demande à un utilisateur de rentrer deux chiffres puis qui les
     * additionnent
     */
    public void addidtion() {
        System.out.println("Programme pour additionner deux chiffres");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("premier chiffre");
        double valeur1 = inputReader.nextDouble();
        System.out.println("deuxième chiffre");
        double valeur2 = inputReader.nextDouble();
        double result = valeur1 + valeur2;
        System.out.println("Le résultat est " + result);
    }
}
