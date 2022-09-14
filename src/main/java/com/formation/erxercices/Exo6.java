package com.formation.erxercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exo6 {
    public void Exo6() {
    }

    /**
     * Méthode qui simule une calculatrice pour les opération d'addition, de soustraction, de division et de multiplication
     */
    public void calculator() {
        String operator = " ";

        System.out.println("Programme pour calculer l'opération sur deux chiffres");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("premier chiffre");
        double valeur1 = inputReader.nextDouble();
        System.out.println("deuxième chiffre");
        double valeur2 = inputReader.nextDouble();
        System.out.println("que voulez vous faire (+,-,*,/)?");
        operator = inputReader.next();
        double addition = valeur1 + valeur2;
        double soustraction = valeur1 - valeur2;
        double multiplication = valeur1 * valeur2;
        double division = valeur1 / valeur2;
        System.out.println(operator);
        if (operator.equals("+")) System.out.println(valeur1 + "+ " + valeur2 +" =" + addition);
        else if (operator.equals("-")) System.out.println(valeur1 + "- " + valeur2 + " =" + soustraction);
        else if (operator.equals("*")) System.out.println(valeur1 + "* " + valeur2 +" =" + multiplication);
        else if (operator.equals("/")) System.out.println(valeur1 + "/ " + valeur2 +" =" + division);
        else
            System.out.println("opération non reconnue");
    }
}
