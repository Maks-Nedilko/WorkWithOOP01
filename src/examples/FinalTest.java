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
public class FinalTest {
    
 
    void m(final int a){
        
        //a++;eror
        
    }
    
    void simpleModif(final Simple simple){
        simple.i=999;
        simple.d=3.14;
        
        //simple = new Simple();eror
        Simple smp = new Simple();
        //simple = smp;eror
    }
    
    public static void main(String[] args) {
        
        Simple simple= new Simple();
        FinalTest ft = new FinalTest();
        ft.simpleModif(simple);
        
        System.out.println(simple.i);
        System.out.println(simple.d);
        
    }
}

class Simple {
    int i=7;
    double d = 4.56;
}

