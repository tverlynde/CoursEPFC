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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle test = new Rectangle();
        test.largeur = 8;
        test.longueur = 5;
        System.out.println(test.getArea());
        System.out.println(test.getPerimeter());
    }
}
