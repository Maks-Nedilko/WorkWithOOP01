/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

/**
 *
 * @author makst
 */
public class EquationApp {
    
    public static void main(String[] args) {


    Equation e1 = new Equation(2,-4);
    e1.solve();
        
    Equation e2 = new Equation(100,2345);
    e2.solve();
    
    Equation e3 = new Equation(2,244);
    e3.solve();
   
    
    
    }
    
}
