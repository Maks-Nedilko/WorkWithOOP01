/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockprior;

/**
 *
 * @author makst
 */
public class Simple {
    
    void nonstatic (){
        System.out.println("Hellow nonstatic");
        f();
    }
    
    public static void main(String[] args) {
        
        Simple simp1 = new Simple();
        Simple.f();
        Simple simp2 = new Simple();
        Simple.f();
        Simple simp3 = new Simple();
        
        simp3.f();
//        System.out.println(Simple.count);
//        System.out.println(simp1.count);
//        System.out.println(simp2.count);
//        System.out.println(simp3.count);
System.out.println("*****************");
    simp1.nonstatic();
    }
    
    int a=89;
    String s = "!!!";
    
    static int count=0;
    
    Simple(){
        count++;
    }
    
    static void f(){
        System.out.println("Hellow from static method !");
        System.out.println("count= " + count);
        
    }
    
}
