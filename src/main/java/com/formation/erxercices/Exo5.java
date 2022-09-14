package com.formation.erxercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exo5 {
    public void Exo5() {
    }

    /**
     * Méthode qui a partir d'une liste de notes, qui attribut la mention à l'élève
     */
    public void leProf() {
        List<Double> maListe = new ArrayList<Double>(Arrays.asList(19.0, 5.0, 3.0, 7.0, -5.0, 16.0));

        for (double item : maListe
        ) {
            System.out.println(item);
            if (item < 5) System.out.println("====> Catastrophique");
            else if (item >= 5 && item < 10) System.out.println("====> Insuffisant");
            else if (item >= 10 && item < 15) System.out.println("====> Peut mieux faire");
            else if (item >= 15 && item < 18) System.out.println("====> Bien");
            else System.out.println("====> Excellent");
        }

    }
}
