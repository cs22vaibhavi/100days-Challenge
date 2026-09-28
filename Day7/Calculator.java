import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Addition:");
        System.out.println("substraction:");
        System.out.println("Multiplication:");
        System.out.println("devision:");
        
        System.out.println("enter your choice:");
        int choice=sc.nextInt();

        System.out.println("enter numer 1:");
        int a=sc.nextInt();

        System.out.println("enter number 2:");
        int b=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}


        
