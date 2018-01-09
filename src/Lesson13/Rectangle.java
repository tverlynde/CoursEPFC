/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

public class Rectangle {
    double longueur ;
    double largeur ;
    
    public double getPerimeter(){
    return ((longueur + largeur)*2);}
    
    public double getArea(){
    return (longueur * largeur);}
    
}

