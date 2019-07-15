package first_oop_work.oop;

import ua.itea.javabase03.*;

public class FirstMAinApp {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Maks");
        p.setAge(21);
        p.setMaried(true);

        p.sleep();
    }
}
