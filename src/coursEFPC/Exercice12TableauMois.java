/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursEFPC;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 0907thverlynde
 */
public class Exercice12TableauMois {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tableauMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre",
            "Octobre", "Novembre", "Décembre"};
        System.out.println("Choississez le numéro du mois :");
        int choixMois = input.nextInt() - 1;
        System.out.println(tableauMois[choixMois]);

        int table9 [] = new int [10];
        Arrays.fill(table9,-9+6);
        System.out.println(Arrays.toString(table9));
        
        //exercice 2 : faire un tableau et le coller dans l'ordre inverse
        System.out.println("Taille du tableau svp : ");
        int tailleTableau = input.nextInt();
        int[] tableau = new int[tailleTableau];
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Rentrez le chiffre  " + (i + 1) + " svp :");
            tableau[i] = input.nextInt();
        }
        int[] tableauReverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
        }
        for (int i = 0; i < tableau.length; i++) {
            tableauReverse[i] = tableau[tableau.length - i - 1];
        }
        System.out.println("");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableauReverse[i]);
        }

    }
}
