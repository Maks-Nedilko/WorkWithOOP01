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
public class Avto {
    
    private Engine engine;
    private Kuzov kuzov;
    private Owner owner;
    private Wheels[] wheels;

    @Override
    public String toString() {
        return "Avto{" + "engine=" + engine + ", kuzov=" + kuzov + ", owner=" + owner + ", wheels=" + wheels[0] + '}';
    }

    
//    public static int Meth(Avto[]array,Owner owner){
//        int result=0;
//        for(int i=0;i<array.length;i++){
//            if(owner.equals(owner)){
//                result++;
//            }
//        }
//        
//        return result;
//    }
    
    public static int counter(Avto[] array,Owner owner){
        
        int count=0;
        
        for(int i=0;i<array.length;i++){
            
            if(array[i].getOwner().getId().equals(owner.getId())){
                count++;
            }
            
        }
        
        return count;
    }
    
    public void Go(){
        System.out.println("Car go");
    }
    
    
    public Avto(){
        
    }
    
    public Avto(Engine engine, Kuzov kuzov, Owner owner) {
        this.engine = engine;
        this.kuzov = kuzov;
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }
    
    
    
}
