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
public class GeometriaApp {
    public static void main(String[] args) {
        
        Figura figura = new Figura();
        Circle circle = new Circle(8);
        Circle circle2 = new Circle(15);
        Rectangle rectangle = new Rectangle(5,6);
        Square square = new Square(7);
        Triangle triangle = new Triangle(3,4,5);
        
        figura = circle;
        figura = circle2;
        
        if(figura instanceof Circle){
        
        circle=(Circle)figura;
        }else{
            System.out.println("eror");
        }
        figura = triangle;
        if(figura instanceof Circle){
        circle =(Circle) figura;}
        else{
            System.out.println("eror");
        }
        
        //instanceof
//        figura = square;
//        figura = circle;
//        rectangle = square;
        //triangle =(Triangle) circle;
        //circle = triangle;
        
        
        
        
        
    }
    
}
