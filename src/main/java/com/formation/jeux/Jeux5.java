package com.formation.jeux;

import java.util.*;

public class Jeux5 {
    public void Jeux5() {
    }

    /**
     * Méthode qui simile le jeu de la roulette russe qui demande le nombre de balle à mettre dans un barrillet vide de huit emplacement
     */
    public void rouletteRusse() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Saissisez un nombre de balle?");
        final double balle = inputReader.nextInt();
        double emplacementVideBarillet = 8 - balle;
        System.out.println("emplacement vide " + emplacementVideBarillet);
        double pourcentageDeVie = emplacementVideBarillet / 8;
        System.out.println("pourcentage de vie " + pourcentageDeVie);
        int mort = 0;
        String user;
        int tour = 1;
        double max = emplacementVideBarillet;
        List<String> barrillet = new ArrayList<String>(Arrays.asList());


        if (balle == 8) System.out.println("au premier tour vous etes mort");
        else if (balle == 0) System.out.println("il n'y pas de balles");
        else {
            for (int j = 1; j <= balle; j++) {
                barrillet.add("X");
                System.out.println("barillet" + barrillet);
            }
            for (int z = 0; z < emplacementVideBarillet; z++) {
                barrillet.add("");
                System.out.println("barillet" + barrillet);
            }
            System.out.println("barillet" + barrillet);
            Collections.shuffle(barrillet);
            System.out.println("barillet" + barrillet);
            for (String item: barrillet) {
                System.out.println("numéro du tour " + tour);
                if (tour % 2 == 0) {
                    user = "user2";
                    System.out.println("tour de " + user);
                } else {
                    user = "user1";
                    System.out.println("tour de " + user);
                }
                if (item == "X") {
                    System.out.println("l'utilsateur " + user + " est mort");
                    break;
                }
                ++tour;
            }
        }
    }


}
