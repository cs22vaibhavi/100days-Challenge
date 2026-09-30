class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
    }
}

class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Vaibhavi", 101);
        Book b1 = new Book("Java Basics", "James");

        s1.display();
        b1.display();
    }
}
