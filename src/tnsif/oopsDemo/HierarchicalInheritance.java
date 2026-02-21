package tnsif.oopsDemo;

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child1 extends Parent {}
class Child2 extends Parent {}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.show();
        c2.show();
    }
}