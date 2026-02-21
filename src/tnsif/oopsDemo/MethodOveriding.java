package tnsif.oopsDemo;

class ParentClass {
    void display() {
        System.out.println("Parent method");
    }
}

class ChildClass extends ParentClass {
    @Override
    void display() {
        System.out.println("Child method overridden");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();
        obj.display();
    }
}