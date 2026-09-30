class Student {
    String name;
    int rollNo;
    int marks;

    //default constructor
    Student(){
        name="unknown";
        rollNo=0;
        marks=0;
    }

    //Overloaded constructor
    Student(String n,int r,int m){
        name=n;
        rollNo=r;
        marks=m;
    }

    void DisplayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
    
    public static void main(String[] args) {
         // Using default constructor
        Student s1 = new Student();

        // Using overloaded constructor
        Student s2 = new Student("Vaibhavi", 101, 85);
        Student s3 = new Student("Vaibhavi", 101, 85);

        s1.DisplayDetails();
        s2.DisplayDetails();
        s3.DisplayDetails();
        
        
    }
}
