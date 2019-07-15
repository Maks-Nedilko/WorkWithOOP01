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
public class Rectangle extends Figura{
    
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + ", b=" + b + '}';
    }
    
    public Rectangle(){
        a=8;
        b=12;
    }
    
    @Override
    double area(){
        System.out.println("area() in Rectangle");
        return a*b;
    }
    
}
