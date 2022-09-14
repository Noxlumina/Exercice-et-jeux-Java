package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
        public static void main(String[] args) {
                // les variables
                String message = "bonjour";
                Integer nombre = 14;
                String nombre2 = "25";
                // caster une chaine de caractère en nombre
                int resu = nombre + parseInt(nombre2);
                // console
                System.out.println(message + " " + nombre + " " + resu);
                // les tableaux
                double[] tab = new double[5];
                tab[0] = 4;
                tab[1] = 45;
                tab[2] = 60;
                tab[4] = 78;
                System.out.println(tab[2]);
                // les listes
                // instanciation de la liste et ajout d'éléments lors de sa création avec la
                // méthode -> Arrays.asList("demo","truc")
                List<String> maListe = new ArrayList<String>(Arrays.asList("demo", "truc"));
                // ajout d'élément
                maListe.add("manger");
                System.out.println(maListe);
                // les boucles
                // la boucle For
                // pour une liste
                for (int i = 0; i < maListe.size(); i++) {
                        System.out.println(maListe.get(i));
                }
                // pour un tableau
                for (int i = 0; i < tab.length; i++) {
                        System.out.println(tab[i]);
                }
                // la boucle Foreach
                for (String item : maListe) {
                        System.out.println(item);
                }
                // la boucle While
                // initialisation de la variable i
                int i = 0;
                while (i < maListe.size()) {
                        System.out.println(tab[i]);
                        i++;
                }
                i = 0;
                while (i < maListe.size()) {
                        System.out.println(maListe.get(i));
                        i++;
                }
                // la boucle Do-while
                i = 0;
                do {
                        System.out.println("coucou");
                } while (i != 0);
                //
                for (double item : tab) {
                        if (item == 45)
                                continue;
                        if (item == 78)
                                break;
                        System.out.println(item);
                }
                //
        }
}
