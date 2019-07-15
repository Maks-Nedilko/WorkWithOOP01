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
public class Engine {
    String brand;
    String model;
    double power;

    public Engine(String brand, String model, double power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" + "brand=" + brand + ", model=" + model + ", power=" + power + '}';
    }

    
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    
    
    
}
