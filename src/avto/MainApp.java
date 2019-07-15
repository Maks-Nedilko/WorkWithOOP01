/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avto;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Owner owner = new Owner("ivan","ivanov","CH345567");
        Owner owner2 = new Owner("Elen","Elle","HC345567");
        Owner owner3 = new Owner("ivan","ivanov","CH345567");
        
        Kuzov kuzov = new Kuzov();
        kuzov.color="black";
        kuzov.number="aaa123";
        kuzov.type="universal";
        
        Kuzov kuzov1 = new Kuzov();
        kuzov1.color="White";
        kuzov1.number="999";
        kuzov1.type="sedan";
        
        Wheels[] wheels = new Wheels[4];
        wheels[0]= new Wheels("Toyo",15,true);
        wheels[1]= new Wheels("Toyo",15,true);
        wheels[2]= new Wheels("Toyo",15,true);
        wheels[3]= new Wheels("Toyo",15,true);
        
        Engine engine = new Engine("Mercedes","mswer345",4.5);
        
        
        Avto avto = new Avto();
        
        avto.setEngine(engine);
        avto.setKuzov(kuzov);
        avto.setOwner(owner);
        avto.setWheels(wheels);
        
//        Owner owner1 = new Owner("ivan","ivanov","HC345567");
//        Kuzov kuzov = new Kuzov();
//        kuzov1.color="black";
//        kuzov1.number="aaa123";
//        kuzov1.type="universal";
//        
//        Wheels[] wheels1 = new Wheels[4];
//        wheels1[0]= new Wheels("Toyo",15,true);
//        wheels1[1]= new Wheels("Toyo",15,true);
//        wheels1[2]= new Wheels("Toyo",15,true);
//        wheels1[3]= new Wheels("Toyo",15,true);
//        
//        Engine engine1 = new Engine("Mercedes","mswer345",4.5);
//        
//        
//        Avto avto1 = new Avto();
//        avto1.setEngine(engine);
//        avto1.setKuzov(kuzov);
//        avto1.setOwner(owner);
//        avto1.setWheels(wheels);
//        
//        Owner owner = new Owner("ivan","ivanov","CH345567");
//        Kuzov kuzov2 = new Kuzov();
//        kuzov2.color="black";
//        kuzov2.number="aaa123";
//        kuzov2.type="universal";
//        
//        Wheels[] wheels2 = new Wheels[4];
//        wheels2[0]= new Wheels("Toyo",15,true);
//        wheels2[1]= new Wheels("Toyo",15,true);
//        wheels2[2]= new Wheels("Toyo",15,true);
//        wheels2[3]= new Wheels("Toyo",15,true);
//        
//        Engine engine2 = new Engine("Mercedes","mswer345",4.5);
        
        
        Avto avto2 = new Avto();
        avto2.setEngine(engine);
        avto2.setKuzov(kuzov);
        avto2.setOwner(owner);
        avto2.setWheels(wheels);
        
        System.out.println(avto);
       
        System.out.println(avto2);
        
        avto.Go();
       
        avto2.Go();
        
       
    
    Avto avto3 = new Avto();
    avto3.setEngine(engine);
    avto3.setKuzov(kuzov1);
    avto3.setOwner(owner2);
    avto3.setWheels(wheels);
    
    Avto[] array = new Avto[3];
    array[0]=avto;
    array[1]=avto2;
    array[2]=avto3;
    
        System.out.println(Avto.counter(array, owner));
    
    }
    
}
