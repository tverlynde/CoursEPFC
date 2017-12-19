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
public class testClassClient {
    public static void main(String[] args) {
        Client olivier = new Client(); 
    olivier.ID="Tronc";
    olivier.firstName="Olivier";
    olivier.lastName="Platane";
    olivier.phone="0615256565";
    olivier.drivingLicense="4876765147";
    olivier.adress="5 rue des Maronniers 7859 Noyer le Sec";
    olivier.age=23;
    
    System.out.println("Notre client adoré s'appelle "+olivier.firstName+" "+olivier.lastName);
    }
}
