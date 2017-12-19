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
    private int year;
    String colour;
    int kmTravelled;
    String model;

    public void setYear(int year) {
        if (year > 1900 && year <= 2017) {
            this.year = year;
        }
    }

    public void setColour(String colour) {
        if (colour.equals("Blue") || colour.equals("White") || colour.equals("Grey") || colour.equals("Green") || colour.equals("Yellow")) {
            this.colour = colour;
        }
    }

    public void setKmTravelled(int kmTravelled) {
        if (kmTravelled > 0 && kmTravelled < 1000000) {
            this.kmTravelled = kmTravelled;
        }
    }

    public void setModel(String model) {
        if (model.equals("Porsche") || model.equals("Maserati") || model.equals("Ferrari")) {
            this.model = model;
        }
    }

    public void setLicensePlate(String licensePlate) {
        licensePlate = licensePlate.toUpperCase();
        int lengthPlate = licensePlate.length();
             if (lengthPlate != 7) return;
                if ('A' <= licensePlate.charAt(0) && 'Z' >= licensePlate.charAt(0)
                && 'A' <= licensePlate.charAt(1) && 'Z' >= licensePlate.charAt(1)
                && 'A' <= licensePlate.charAt(2) && 'Z' >= licensePlate.charAt(2)
                && licensePlate.charAt(3) == '-'
                && Character.isDigit(licensePlate.charAt(4))
                && Character.isDigit(licensePlate.charAt(5))
                && Character.isDigit(licensePlate.charAt(6))) {
            this.licensePlate = licensePlate;
            /*
            if (licensePlate.matches("[A-Z]{3}-[0-9]{3}")) {
                this.licensePlate = licensePlate;
                    }*/
        
    }}

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public int getKmTravelled() {
        return kmTravelled;
    }

    public String getModel() {
        return model;
    }

    void print() {
        System.out.println("");
    }

    String getDesc() {
        return "La voiture sélectionnée est une \n"
                + "\tmodèle: \t\t" + model + "\n"
                + "\tannée: \t\t\t" + year + "\n"
                + "\tcouleur: \t\t" + colour + "\n"
                + "\tkilométrage: \t\t" + kmTravelled + "\n"
                + "\timmatriculation: \t" + licensePlate + "\n";
    }
}
