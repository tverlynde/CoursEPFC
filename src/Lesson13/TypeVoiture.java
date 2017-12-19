/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author 0907thverlynde
 */
public class TypeVoiture {
String licensePlate;
int year;
String colour;
int kmTravelled;
String model;

void print() {
    System.out.println("");
}

String getDesc() {
return "La voiture sélectionnée est une \n"+
            "\tmodèle: \t\t" + model + "\n"+
            "\tannée: \t\t\t" + year + "\n"+
            "\tcouleur: \t\t" + colour + "\n"+
            "\tkilométrage: \t\t" + kmTravelled + "\n"+
            "\timmatriculation: \t" + licensePlate + "\n";
}
}