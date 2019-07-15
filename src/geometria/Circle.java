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
public class Circle extends Figura{
    
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle (){
        radius=1;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
    
    @Override
    double area(){
        
        System.out.println("area() in Circle");
        return 3.1415926*radius*radius;
    }
    
}
