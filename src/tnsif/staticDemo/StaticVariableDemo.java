package tnsif.staticDemo;

class Student {
    int roll;
    String name;
    static String college = "SVIT";  // Static variable

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Keerthana");
        Student s2 = new Student(2, "Kiran");

        s1.display();
        s2.display();
    }
}