package tnsif.oopsDemo;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum int: " + c.add(5, 3));
        System.out.println("Sum double: " + c.add(5.5, 2.5));
    }
}