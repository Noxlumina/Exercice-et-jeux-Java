package com.formation.jeux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jeux3 {
    public void Jeux3() {
    }

    double profit;
    int nbrPlace;
    int nbrTour;
    int PlaceRestante;

    List<Integer> nbrFile = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 4));

    /**
     * Méthode qui permet de calculer le profit au fur et à mesure du remplissage du
     * manège
     */
    public double calculerProfit(int personne, double prix) {
        this.profit += personne * prix;
        return this.profit;
    }

    /**
     * Méthode qui modifie la file d'attente au fur et à mesure que les groupes
     * rentrent dans le manège
     * les gens qui sont passés retournent dans la queue de la file
     */
    public void modifierFileAttente(List<Integer> groupe, int personne) {
        System.out.println("file avant:" + this.nbrFile);
        groupe.remove(0);
        System.out.println("file après:" + this.nbrFile);
        groupe.add(personne);
        System.out.println("file après ++:" + this.nbrFile);

    }

    /**
     * remplissage du manège en fonction du nombre de personne dans un groupe
     * un groupe ne peut pas être dissocié
     */
    public void remplissageManege(int placeDisponible) {
        if (placeDisponible >= 0) {
            int personneGroupe = this.nbrFile.get(0);
            this.calculerProfit(personneGroupe, 1.0);
            this.modifierFileAttente(nbrFile, personneGroupe);
        }
    }

    /**
     * remplissage du manège en fonction du nombre de personne , pour un tour
     */
    public void remplissageTour(List<Integer> file) {
        for (int j = 0; j < file.size(); j++) {
            System.out.println("place restante tour" + this.PlaceRestante);
            this.PlaceRestante -= file.get(0);
            System.out.println("place restante tour" + this.PlaceRestante);
            remplissageManege(this.PlaceRestante);
            System.out.println(this.nbrFile);
        }
        ;
        this.PlaceRestante = this.nbrPlace;
        System.out.println("remise à zéro" + this.nbrPlace);
        System.out.println("place restante hors tour" + this.PlaceRestante);

    }

    /**
     * réactualise le nombre de place à chaque tour
     */
    public void initManege(int place) {
        this.PlaceRestante = place;
    }

    /**
     * affichage du profit
     */
    public void affichageProfit(double profit) {
        System.out.println("profit = " + profit);
    }

    /**
     * amorce le manège pour le nombre de tours donnés
     */
    public void miseEnService(int tour) {
        for (int i = 0; i < tour; i++) {
            System.out.println("tour numéro");
            System.out.println(this.nbrFile);
            this.initManege(this.nbrPlace);
            remplissageTour(this.nbrFile);
        }
        this.affichageProfit(this.profit);
    }

    /**
     * Méthode qui met en route la simulation d'un manège avec une file d'attente un
     * nombre de place,un prix par personne et un bombre de tour
     */
    public void rollercoaster() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("saissisez un nombre de place");
        this.nbrPlace = inputReader.nextInt();
        System.out.println("saissisez un nombre de tours");
        this.nbrTour = inputReader.nextInt();
        System.out.println(this.nbrFile);
        this.miseEnService(this.nbrTour);

    }

}
