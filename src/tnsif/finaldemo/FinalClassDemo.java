package tnsif.finaldemo;

final class Vehicle {
    void display() {
        System.out.println("Final class cannot be inherited");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.display();
    }
}