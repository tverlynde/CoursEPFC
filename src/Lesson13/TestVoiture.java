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
        maVoitureQuiPollue.setColour("White");
        maVoitureQuiPollue.setKmTravelled(1515446584);
        maVoitureQuiPollue.setLicensePlate("AAA-111");
        maVoitureQuiPollue.setModel("Porsche");
        maVoitureQuiPollue.setYear(2017);
        System.out.println(maVoitureQuiPollue.getDesc());
    }

}
