package tnsif.oopsDemo;

class Student {
    int id;
    String name;

    Student() {
        System.out.println("Default constructor called");
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Keerthana");
        s2.display();
    }
}