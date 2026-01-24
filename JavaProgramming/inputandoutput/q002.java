package JavaProgramming.inputandoutput;
import java.util.Scanner;
public class q002 {

    // Method to calculate add two numbers
    public static void addition(int number1, int number2) {
        System.out.println("Addition of two numbers is: " + (number1 + number2));
    }

    // Method to calculate subtract two numbers
    public static void subtraction(int number1, int number2) {
        System.out.println("Subtraction of two numbers is: " + (number1 - number2));
    }

    // Method to calculate product of two numbers
    public static void multiplication(int number1, int number2) {
        System.out.println("Multiplication of two number is: " + (number1 * number2));
    }

    // Method to calculate division of two numbers
    public static void division(int number1, int number2) {
        System.out.println("Divivsion of two number is: " + (number1 / number2));
    }

    // Method to calculate modulus of two numbers
    public static void modulus(int number1, int number2) {
        System.out.println("Modulus of two number is: " + (number1 % number2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // if the user enter an invalid input 
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input! Please enter a valid input");
            scanner.close();
            return;
        }

        // enter a first number
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        // enter a second number
        int number2 = scanner.nextInt();


        // Methods call 
        addition(number1, number2);
        subtraction(number1, number2);
        multiplication(number1, number2);
        division(number1, number2);
        modulus(number1, number2);
        scanner.close();
    }
}
