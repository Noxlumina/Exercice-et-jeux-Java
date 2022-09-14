package com.formation.exercices;

import java.util.*;

public class Exo13 {
    public void Exo13() {
    }

    /**
     * Méthode qui réorganise une liste désordonnée dans l'ordre croissant
     */
    public void centrale() {
        List<Integer> List = new ArrayList<Integer>(Arrays.asList(12, 25, 5, 7, 6, -5));
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
    }

    /**
     * Méthode qui réorganise une liste désordonnée dans l'ordre décroissant
     */
    public void centraleInverse() {
        List<Integer> List = new ArrayList<Integer>(Arrays.asList(12, 25, 5, 7, 6, -5));
        System.out.println(List);
        Collections.sort(List, Collections.reverseOrder());
        System.out.println(List);
    }
}
