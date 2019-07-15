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
public class FinalTest2 {
    
    final boolean bool=true;
    final long a= 5000000;
    final Simple smp=new Simple();
    
    void m(){
        //bool=true;eror
        //a=23;eror
        smp.d=0.0;
        smp.i=10;
        
        //smp = new Simple();eror
        
//        Simple smp2 = new Simple();eror
//        smp = smp2;eror
    }
    
}
