/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.itea.javabase03.equ;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        SquareEquation eq = new SquareEquation(1,-11,30);
        eq.printSolution();
    }
}
