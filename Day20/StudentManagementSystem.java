class Person {
    void display() {
        System.out.println("I am a person");
    }
}

class Student extends Person {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method overriding
    void display() {
        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
    }

    // Method overloading
    void display(String name) {
        System.out.println("Student Name: " + name);
    }

    void display(String name, int marks) {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {

        Student s = new Student("Vaibhavi", 85);

        // Overriding
        s.display();

        // Overloading
        s.display("Vaibhavi");
        s.display("Vaibhavi", 85);
    }
}
