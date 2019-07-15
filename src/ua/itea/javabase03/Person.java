
package ua.itea.javabase03;

public class Person {
    public Person(){}
    
     private String name="noname";
     private int age=30;
     private StringBuilder sex=new StringBuilder("man");
     private boolean maried=true;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", sex=" + sex + ", maried=" + maried + '}';
    }
    
//    public Person(String name){
//        this.name=name;
//    } 
//    
//    public Person(String name,int age){
//        this(name);//только первая строчка кода любого конструктора
//        this.age=age;
//    }
//    public Person(String name,boolean maried){
//        this(name);
//        this.sex=sex;
//        
     
    public Person(String name, int age, StringBuilder sex, boolean maried){
        this.name = name ;
        this.age = age;
        this.sex = sex;
        this.maried = maried;
        
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    }
    public void go(double path) {
        System.out.println(name + " go to way " + path + " method ");
    }
    
    public void sleep(){
        System.out.println(name + " is sleeping ");
    }
    
    public void eat(){
        System.out.println(name + " is eating...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StringBuilder getSex() {
        return sex;
    }

    public void setSex(StringBuilder sex) {
        this.sex = sex;
    }

    public boolean isMaried() {
        return maried;
    }

    public void setMaried(boolean maried) {
        this.maried = maried;
    }
    
   
}
