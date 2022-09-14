package com.formation.erxercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo11 {
    public void Exo11() {
    }
     Double nombre = 2437.57;
    List<Double> monnaiesList = new ArrayList<Double>(Arrays.asList(500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.05, 0.02, 0.01));
    Double nbrMonnaie;
    /**
     * Méthode qui à partir d'un montant permet de définir le nombre de billets et de pièces pour arriver à ce nombre
     */
    public void billet() {
        for (Double item : this.monnaiesList) {
            if (this.nombre >= item) {
                this.nbrMonnaie = Math.floor(this.nombre / item);
                if (this.nombre >= 5) System.out.println("Nombre de billets de " + item + " :" + this.nbrMonnaie);
                if (this.nombre < 5) System.out.println("Nombre de pièces de " + item + " :" + this.nbrMonnaie);
                this.nombre -= item * this.nbrMonnaie;
            }
        }
    }


}

