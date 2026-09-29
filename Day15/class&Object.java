class Student {

    String name;
    int rollNo;
    int marks;

    void displayDetails() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Vaibhavi";
        s1.rollNo = 1;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Anu";
        s2.rollNo = 2;
        s2.marks = 80;

        s1.displayDetails();
        s2.displayDetails();
    }
}
