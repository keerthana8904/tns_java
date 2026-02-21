package tnsif.oopsDemo;

class ParentSingle {
    void show() {
        System.out.println("Parent method");
    }
}

class ChildSingle extends ParentSingle {}

public class SingleInheritance {
    public static void main(String[] args) {
        ChildSingle obj = new ChildSingle();
        obj.show();
    }
}