/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

import java.util.Scanner;

/**
 *
 * @author 0907thverlynde
 */
public class RectangleUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez introduire hauteur et largeur :");
        Rectangle rect = new Rectangle();
        rect.largeur = input.nextDouble();
        rect.longueur = input.nextDouble();
        System.out.println("L'aire est de " + rect.getArea() + " cm.");
        System.out.println("Le périmère est de " + rect.getPerimeter() + " cm.");
    }
}
