package tnsif.staticDemo;

class Demo {

    static void show() {
        System.out.println("Static method called");
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        Demo.show();  // Calling without object
    }
}