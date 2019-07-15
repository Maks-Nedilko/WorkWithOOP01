/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.itea.javabase03;

/**
 *
 * @author makst
 */
public class PersonApp {
    public static void main(String[] args) {
        
        Person person1 = new Person();
        Person person2 = new Person();
        
//        person1.name="Vasya volk";
//        person1.age=32;
//        person1.sex= new StringBuilder("man");
//        person1.maried=true;
//        
//        person1.eat();
//        person1.go(5000);
//        person1.sleep();
        
        System.out.println("");
        
       person2.setName("Maks");
        person2.setAge(20);
        person2.setSex(new StringBuilder("man"));
        person2.setMaried(false);
        
        person2.eat();
        person2.go(5000);
        person2.sleep();
    }
    
}
