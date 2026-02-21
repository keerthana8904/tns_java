package tnsif.finaldemo;

public class FinalVariableDemo {

    final int x = 100;  // Final variable

    public static void main(String[] args) {

        FinalVariableDemo obj = new FinalVariableDemo();
        System.out.println("Final variable: " + obj.x);

        // obj.x = 200;  // ERROR if uncommented
    }
}