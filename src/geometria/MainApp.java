/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author makst
 */
public class MainApp {
    public static void main(String[] args) {
        //demostration polimorfism
        Figura figura;
        
        Circle circle = new Circle(6);
        
        figura = circle;
        
        figura.area();
        
        figura = new Rectangle (8,9);
        
        figura.area();
        
        
        Rectangle rect = new Square(8);
        
        figura = rect;
        
        figura.area();
        
        
        Triangle tr = new Triangle(3,4,5);
        figura=tr;
        figura.area();
        
        
        Figura figura2=new Square(3);
        rect=(Rectangle)figura2;
        ((Figura)rect).area();
        
        
        
    }
    
}
