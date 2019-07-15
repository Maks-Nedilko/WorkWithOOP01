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
public class TestPolimorfApp {
    public static void main(String[] args) {
        Figura [] array = new Figura[6];
        
        array[0]=new Triangle();
        array[1]=new Circle();
        array[2]=new Circle();
        array[3]=new Figura();
        array[4]=new Square();
        array[5]=new Rectangle();
        
        for(Figura f:array){
            System.out.println(f);
        }
    }
    
}
