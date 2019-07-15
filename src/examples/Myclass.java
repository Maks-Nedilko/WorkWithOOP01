
package examples;


public class Myclass {
    
    static void f(){
        System.out.println("static f() in myclass");
    }
    
    void g(){
        System.out.println("nonstatic g in myclass");
    }
    
    int a = 1;
    
    
}

class MySecond extends Myclass{
    
    static void f(){
        System.out.println("static f() in mysecond ");
    }
    
    @Override
    void g(){
        System.out.println("nonstatic g() in mysecond");
    }
    int a =1000;
}

class Test{
    
    public static void main(String[] args) {
        
        Myclass mf = new Myclass();
        MySecond ms = new MySecond();
        
        mf.f();
        mf.g();
        System.out.println(mf.a);
        
        System.out.println("*************");
        ms.f();
        ms.g();
        System.out.println(ms.a);
        
        mf=ms;
        System.out.println("+++++++++++");
        
        mf.f();
        mf.g();
        System.out.println(mf.a);
        //ковариантность возвращаемого типа
        System.out.println("***************");
        
        ((Myclass)ms).g();
        ((Myclass)ms).f();
        ms.f();
        System.out.println(((Myclass)ms).a);
        System.out.println(ms.a);
        
        
    }
}
