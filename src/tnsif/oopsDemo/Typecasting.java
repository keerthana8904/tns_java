package tnsif.oopsDemo;

public class Typecasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a; // implicit
        System.out.println("Implicit casting: " + b);

        double x = 20.5;
        int y = (int) x; // explicit
        System.out.println("Explicit casting: " + y);
    }
}