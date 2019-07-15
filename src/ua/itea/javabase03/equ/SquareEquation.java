package ua.itea.javabase03.equ;

public class SquareEquation {

    private double d() {
        return b * b - 4 * a * c;
    }

    private double a;
    private double b;
    private double c;

    public SquareEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a!=0");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printSolution() {
        double di = d();

        if (di < 0) {
            System.out.println("no ");
        }
        if (di == 0) {
            double x = -b / (2 * a);
            System.out.println("x= " + x);

        }

        if (di > 0) {
            double x1 = (-b - Math.sqrt(di)) / (2 * a);
            double x2 = (-b + Math.sqrt(di)) / (2 * a);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }

}
