package JavaProgramming.inputandoutput;

import java.util.Scanner;

public class q003 {

    // Method to convert a number into octal number
    public static String octal(int number){
        String octal = Integer.toOctalString(number); // Convert a int number into String using predefined method 
        return octal;
    }

    // Method to convert a number into HexaDecimal number
    public static String  hexadecimal(int number1){
        String hex = Integer.toHexString(number1);  // Convert a int number into String using predefined method 
        return hex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");

        // If the user enter a wrong input then the message will print
        if(!scanner.hasNextInt()){
            System.out.println("Please enter a valid number");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        String octal = octal(number);  // Call the octal method and store the value in String octal variable
        String HexaDecimal = hexadecimal(number);  // Call the hexadecimal method and store the value in String Hexadecimal variable

        System.out.println("Number: "+number+"\nOctal Number: "+octal);  // Print the value of octal number
        System.out.println();
        System.out.println("Number: "+number+"\nHexaDecimal Number: "+HexaDecimal);  // Print the value of Hexadecimal number
    }
}