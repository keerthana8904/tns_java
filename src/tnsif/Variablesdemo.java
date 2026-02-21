package tnsif.oopsDemo;

public class Variablesdemo {

    int instanceVar = 20;
    static int staticVar = 30;

    public static void main(String[] args) {

        int localVar = 10;
        Variablesdemo obj = new Variablesdemo();

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}