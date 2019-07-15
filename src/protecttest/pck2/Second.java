/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protecttest.pck2;

import protecttest.First;

/**
 *
 * @author makst
 */
public class Second extends First{
    
   void f(First first){
      // System.out.println(first.a);eror
       //first.a++;eror
   }
    
    void m(){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        new Second().m();
    }
    
}
