/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prottype;

/**
 *
 * @author makst
 */
public class Papa {
    
    int i ;
    
    protected void f (){
        
    }
    
    Apple getFruit(){
        return new Apple();
    }
    Pear getF(){
    return new Pear();
    }
    
    long m(int a){
        
        return 1;
    }
    
}

class Son extends Papa{
    @Override
    long m(int a){
        
        return 51;
    }
    
    @Override
    Antonovka getFruit(){
        return new Antonovka();
    }
    // void f(){
      //eror  
    //}
    
}

class Dauther extends Papa{
    
    @Override
    public  void f (){
        
    }
    @Override
    Berra getF(){
    return new Berra();
    }
    
}
//переопределенный метод может вернуть результат тип 
//которого является результатом определяемого метода
class Apple{
    
}
class Antonovka extends Apple{
    
}
class Pear{
    
}
class Berra extends Pear{
    
}