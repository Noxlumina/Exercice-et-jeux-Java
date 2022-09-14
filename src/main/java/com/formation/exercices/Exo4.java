package com.formation.exercices;

import java.util.Scanner;

public class Exo4 {
    public void Exo4() {
    }

    /**
     * Méthode sui demande de taper trois chiffres puis qui donne le plus grand des
     * trois
     */
    public void troisNombre() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("premier nombre");
        double valeur1 = inputReader.nextDouble();
        System.out.println("deuxième nombre");
        double valeur2 = inputReader.nextDouble();
        System.out.println("troisième nombre");
        double valeur3 = inputReader.nextDouble();
        double plusgrand1 = Math.max(valeur1, valeur2);
        double plusgrand2 = Math.max(plusgrand1, valeur3);
        if (valeur1 > valeur2)
            System.out.println("le plus grand chiffre est : " + plusgrand2);
    }
}
