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
public class Wheels {
    String brand;
    int radius;
    boolean iswinter;

    public Wheels(String brand, int radius, boolean iswinter) {
        this.brand = brand;
        this.radius = radius;
        this.iswinter = iswinter;
    }
    
    

    @Override
    public String toString() {
        return "Wheels{" + "brand=" + brand + ", radius=" + radius + ", iswinter=" + iswinter + '}';
    }
    
    
}
