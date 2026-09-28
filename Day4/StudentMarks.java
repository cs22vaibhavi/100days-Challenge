import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter student name:");
        String name=sc.nextLine();

        System.out.println("enter Marks for subject1:");
        int marks1=sc.nextInt();

        System.out.println("enter marks for subject2:");
        int marks2=sc.nextInt();

        System.out.println("enter marks for subject3:");
        int marks3=sc.nextInt();

        System.out.println("enter marks for subject4:");
        int marks4=sc.nextInt();

        System.out.println("enter marks for subject5:");
        int marks5=sc.nextInt();

        
       int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = total / 5.0;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
        
            

    }}  
        
    
