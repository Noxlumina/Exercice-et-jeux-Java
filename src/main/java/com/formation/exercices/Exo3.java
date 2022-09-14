package com.formation.exercices;

import java.util.Scanner;

public class Exo3 {
    public void Exo3() {
    }

    /**
     * Méthode qui demande le prix de fabrication puis le prix de ventre et qui dit
     * si on a un profit et une perte puis sa valeur
     */
    public void profOuPerte() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("rentrer le prix de fabrication");
        double valeur1 = inputReader.nextDouble();
        System.out.println("rentrer le prix de vente");
        double valeur2 = inputReader.nextDouble();
        double diff = valeur2 - valeur1;
        if (valeur1 > valeur2)
            System.out.println("on a une perte de " + -diff);
        else
            System.out.println("on a un profit de " + diff);
    }
}
