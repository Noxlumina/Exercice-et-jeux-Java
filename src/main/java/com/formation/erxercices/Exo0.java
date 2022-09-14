package com.formation.erxercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo0 {
//    constructor
    public void Exo0(){

    }
//    exercice sur les listes
    public void usersList(){
        /*
         * créer une liste
         * demander à un utilisateur de donner des valeurs pour la liste
         * puis afficher la liste
         */
        List<String> maListe = new ArrayList<String>();
        Scanner inputReader = new Scanner(System.in);
        String cont = " ";

        do {
            System.out.println("Enter un mot (de moins de 5 caractères): ");
            String valeur = inputReader.next();
            if (valeur.length() < 5)
                maListe.add(valeur);
            else
                System.out.println("tapez un mot de moins de 5 caratères");
            System.out.println("Voulez vous rajouter d'autres valeur si oui tapez: o");
            cont = inputReader.next();
            System.out.println(maListe);
        } while (cont == "o");
    }
}
