package com.formation.jeux;


import java.sql.Array;
import java.util.Scanner;

public class Jeux7 {
    public void Jeux7() {
    }

    //    initialisation des variables

    //    public String[][] plateau = this.initialisationPlateau();
    final String[][] plateau = new String[3][3];
    String user;
    String joueur1 = "joueur1";
    String joueur2 = "joueur2";
    boolean gagne = false;
    Integer tour = 0;
    boolean valide = false;
    String mark;

    Scanner inputReader = new Scanner(System.in);


//    public String[][] affiche(String[][] tab) {
//        // afficher les éléments du tableau
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                System.out.println("plateau[" + i + "][" + j + "]=" + tab[i][j]);
//            }
//        }
//        this.plateau = tab;
//        System.out.println(this.plateau);
//        return this.plateau;
//    }


    public String[][] initialisationPlateau() {
//        String[] plateau = new Array[new String["A1", "A2", "A3"],["B1", "B2", "B3"],["C1", "C2", "C3"]];
//        String[][] strings = {{"A1", "A2", "A3"}, {"B1", "B2", "B3"}, {"C1", "C2", "C3"}};
        this.plateau[0][0]="A1";
        this.plateau[0][1]="A2";
        this.plateau[0][2]="A3";
        this.plateau[1][0]="B1";
        this.plateau[1][1]="B2";
        this.plateau[1][2]="B3";
        this.plateau[2][0]="C1";
        this.plateau[2][1]="C2";
        this.plateau[2][2]="C3";
//        affiche(strings);
        return this.plateau;
    }

    public void conditionGagne() {
        if (((this.plateau[0][0] == mark) && (this.plateau[0][1] == mark) && (this.plateau[0][2] == mark))
                || ((this.plateau[1][0] == mark) && (this.plateau[1][1] == mark) && (this.plateau[1][2] == mark))
                || ((this.plateau[2][0] == mark) && (this.plateau[2][1] == mark) && (this.plateau[2][2] == mark))
                || ((this.plateau[0][0] == mark) && (this.plateau[1][0] == mark) && (this.plateau[2][0] == mark))
                || ((this.plateau[1][0] == mark) && (this.plateau[1][1] == mark) && (this.plateau[1][2] == mark))
                || ((this.plateau[2][0] == mark) && (this.plateau[2][1] == mark) && (this.plateau[2][2] == mark))
                || ((this.plateau[2][2] == mark) && (this.plateau[1][1] == mark) && (this.plateau[0][0] == mark))) {
            gagne = true;
            System.out.println(user + " a gagné");
        }
    }

    public void changementTour() {
        ++tour;
        System.out.println("["+plateau[0][0]+"]"+"["+plateau[0][1]+"]"+"["+plateau[0][2]+"]");
        System.out.println("["+plateau[1][0]+"]"+"["+plateau[1][1]+"]"+"["+plateau[1][2]+"]");
        System.out.println("["+plateau[2][0]+"]"+"["+plateau[2][1]+"]"+"["+plateau[2][2]+"]");
        System.out.println("numéro de tour : " + tour);
    }

    public void definirNomJoueur() {
        System.out.println("le joueur 1 est :");
        joueur1 = inputReader.next();
        System.out.println("le joueur 2 est :");
        joueur2 = inputReader.next();
    }

    public void choixJoueur(String choix) {
        System.out.println("votre choix est " + choix);
        System.out.println("plateau[0][0] " + plateau[0][0]);
        switch (choix) {
            case "A1":
                if (plateau[0][0].equals(choix)) {
                    plateau[0][0] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "A2":
                if (plateau[0][1].equals(choix)) {
                    plateau[0][1] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "A3":
                if (plateau[0][2].equals(choix)) {
                    plateau[0][2] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "B1":
                if (plateau[1][0].equals(choix)) {
                    plateau[1][0] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "B2":
                if (plateau[1][1].equals(choix)) {
                    plateau[1][1] = mark;
                    valide = true;

                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "B3":
                if (plateau[1][2].equals(choix)) {
                    plateau[1][2] = mark;
                    valide = true;
                    break;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }
            case "C1":
                if (plateau[2][0].equals(choix)) {
                    plateau[2][0] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "C2":
                if (plateau[2][1].equals(choix)) {
                    plateau[2][1] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            case "C3":
                if (plateau[2][2].equals(choix)) {
                    plateau[2][2] = mark;
                    valide = true;
                } else {
                    System.out.println("la case a déjà été utilisée");
                }; break;
            default: {
                System.out.println("choix non valide, quelle case choissisez vous?");
                choix = inputReader.next().toUpperCase();
            }
        }
    }


    public void tourJoueur() {
        System.out.println("tour de " + user);
        System.out.println("Quel case choississz vous?");

        while (!valide) {
            String choix = inputReader.next();
            choix = choix.toUpperCase();
            System.out.println("mon choix est " + choix);
            choixJoueur(choix);
        }
        valide = false;
    }


    public void morpion() {
        initialisationPlateau();
        definirNomJoueur();
        System.out.println("le joueur 1 est :" + this.joueur1 + " le joueur 2 est " + joueur2);
        while (!gagne) {
            changementTour();
            if (tour % 2 == 0) {
                user = joueur2;
                mark = "X";
                tourJoueur();
            } else {
                user = joueur1;
                mark = "O";
                tourJoueur();
            }
            conditionGagne();
        }
    }


    public void TICTACDOE() {
        this.morpion();
    }
}