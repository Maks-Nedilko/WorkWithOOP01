/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author makst
 */
public class ExtendsExample {
    
    void f(int i,double b,float f){
        System.out.println("first");   
    }
    
}

class B extends ExtendsExample{
    
    //@Override
             
     void f(int i,float f,double b){
         System.out.println("second");
    }
     
     public static void main(String[] args) {
        B b = new B();
        double d = 3.4;
        float f = 1.2f;
        int i = 0;
        
        b.f(i, d, f);
        b.f(i, f, d);
    }
}
