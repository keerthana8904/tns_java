package tnsif.finaldemo;

class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // void show() {}  // ERROR if overridden
}

public class FinalMethodDemo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
    }
}