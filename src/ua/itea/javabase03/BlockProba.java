
package ua.itea.javabase03;


public class BlockProba {
    public static void main(String[] args) {
        
        new BlockProba();
        System.out.println("");
        new BlockProba();
        
    }
    
   
    
    int a=89;
    double d=45.909;
    String s="ITEA";
     {
    
        System.out.println("IN First inirialising BLOCK");
        
         System.out.println("a= "+a);
         System.out.println("d= "+d);
        a=0;
        s="java";
    
    }
    
    BlockProba(){
        a=0;
        d=0;
        s="";
        System.out.println("IN construltor!!");
    }
    {
        System.out.println("IN Secong inirialising BLOCK");
        a=99;
        s="Oracle";
        d=3.14;
        
        
    }
    
}
