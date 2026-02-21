package tnsif.oopsDemo;

class GrandParent {
    void show() {
        System.out.println("Grandparent class");
    }
}

class ParentLevel extends GrandParent {}
class ChildLevel extends ParentLevel {}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        ChildLevel obj = new ChildLevel();
        obj.show();
    }
}