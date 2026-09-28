//1st method
class Main {
    public static void main(String[] args) {

        int num=-5;

        if(num>0){
            System.out.println("Positive number");
        }
        else if(num<0){
            System.out.println("Nagative number");
        }
        else{
            System.out.println("Zero");
        }

    }}


//2nd method user input
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number:");
        int num=sc.nextInt();
        

        if(num>0){
            System.out.println("Positive number");
        }
        else if(num<0){
            System.out.println("Nagative number");
        }
        else{
            System.out.println("Zero");
        }

    }}
        
            

        
        
    
