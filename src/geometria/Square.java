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
public class Square extends Rectangle{
    Square(double a){
        super(a,a);
    }

    @Override
    public String toString() {
        return "Square{" + '}';
    }
    public Square(){
        a=15;
    }
    
    @Override
    double area(){
        System.out.println("area() in square ");
        return a*a;
    }
    
}
