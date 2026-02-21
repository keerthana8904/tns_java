package tnsif.exceptions;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // Exception
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}