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
public class TestVoiture {

    public static void main(String[] args) {
        TypeVoiture maVoitureQuiPollue = new TypeVoiture();
        maVoitureQuiPollue.colour = "Noir de Jais";
        maVoitureQuiPollue.kmTravelled = 54100;
        maVoitureQuiPollue.setLicensePlate("AAA-111");
        maVoitureQuiPollue.model = "Carrera S";
        maVoitureQuiPollue.setYear(2017);
        System.out.println(maVoitureQuiPollue.getDesc());
    }

}
