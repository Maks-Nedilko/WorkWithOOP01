
package equation;


public class Equation {
    
    private double a;
    private double b;
    private double x;
    
//    public Equation(){
//        
//        if(a==0){
//            throw new IllegalArgumentException("a!=");
//        }
//        this.a=getA();
//        this.b=getB();
//        
//    }

    public Equation(double a, double b) {
        if(a==0){
            throw new IllegalArgumentException("a!=");
        }
        this.a = a;
        this.b = b;
    }
    {
        System.out.println("**********************************");
        
    }
    
    
    public void solve(){
        x=-getB()/getA();
        System.out.println("x = " + x);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
}
