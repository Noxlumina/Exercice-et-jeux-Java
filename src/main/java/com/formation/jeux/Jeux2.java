package com.formation.jeux;

import java.util.Scanner;

public class Jeux2 {
    public void Jeux2() {
    }

    /**
     * Méthode qui demande à un utilisateur de deviner un prix en lui indiquant si c'esy plus ou moins et qui insatancie un niveau de vie
     */
    public void justeprix() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Saissisez un nombre de vie?");
        int nbrVie = inputReader.nextInt();
        System.out.println("nombre aléatoire entre 0 et ?");
        int maxAleatoire = inputReader.nextInt();
        final long nbrAleatoire = Math.round(Math.random() * maxAleatoire);

        while (nbrVie > 0) {
            System.out.println("------");
            System.out.println("il vous reste " + nbrVie + " vie(s)");
            int nombre = inputReader.nextInt();

            if (nombre < nbrAleatoire) System.out.println("C'est plus");
            else if (nombre > nbrAleatoire) System.out.println("c'est moins");
            else {
                System.out.println("tu as trouvé");
                break;
            }
            nbrVie--;
            if (nbrVie == 0) System.out.println("tu n'as plus de vie");
        }


    }
}
