/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasled;

/**
 *
 * @author makst
 */
public class Human extends Mammals{
    String name;
    
    void speak(){
        System.out.println("Human is spealing");
    }
    
    void think(){
        System.out.println("Human is thinking about...");
    }
}
