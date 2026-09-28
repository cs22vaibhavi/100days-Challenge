//1st method
class Main {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;

        if(num1>num2 && num1>num3){
            System.out.println("Num1 is greater");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num2 is greater");
        }
        else{
            System.out.println("num3 is greater");
        }
    
    }
}

//2nd method user input 
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new canner(System.in);
        System.out.println("enter number1:");
        int num1=sc.nextInt();
        System.out.println("enter number2:");
        int num2=sc.nextInt();
        System.out.println("enter number3:");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Num1 is greater");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num2 is greater");
        }
        else{
            System.out.println("num3 is greater");
        }
    
    }
}
