package com.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exo12 {
    public void Exo12() {
    }

    /**
     * Méthode qui donne le plus bas chiffre à partir d'une liste de nombres
     */
    public void temperature() {
        List<Integer> List = new ArrayList<Integer>(Arrays.asList(12, 5, 7, 25, 6, -5));
        System.out.println(List);
        Integer proche = List.get(0);

        for (Integer item : List) {
            Integer temperature = item;
            if ((Math.abs(item) < Math.abs(proche)) || (Math.abs(item) == Math.abs(proche) && item < 0)) {
                proche = item;
            }

        }
        System.out.println(proche);
    }
}
