/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author makst
 */
public class StudentApp {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        student1.gotostudy();
        student1.gotocourses();
        student1.gotosession();
        
        System.out.println("*********************");
        student2.setName("Maks");
        student2.setFuculty("RTF");
        student2.setCourse(1);
        //student2.setSession(true);
        
        student2.gotostudy();
        student2.gotocourses();
        student2.gotosession();
        
        System.out.println("************************");
        student3.setName("Igor");
        //student3.setFuculty("ITS");
        //student3.setCourse(2);
        student3.setSession(false);
        
        student3.gotostudy();
        student3.gotocourses();
        student3.gotosession();
        
    }
    
}
