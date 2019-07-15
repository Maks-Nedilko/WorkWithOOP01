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
public class Triangle extends Figura{
    
    private double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    public Triangle(){
        a=5;
        b=3;
        c=4;
    }
    
    @Override
    double area(){
        double p =0.5*(a+b+c);
        System.out.println("area() in triangle ");
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
    }
    
}
