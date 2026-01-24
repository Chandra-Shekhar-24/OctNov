package JavaProgramming.inputandoutput;

import java.util.Scanner;

public class q005 {

    // Method to cal sorface area
    public static int surfaceArea(int length, int width, int height) {
        int surfacearea = (2 * (width * length + length * height + height * width));
        return surfacearea;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length size: ");

        if(input.hasNextInt()){
            System.out.println("Enter an int value");
            input.close();
            return;
        }
        int length = input.nextInt();
        System.out.println("Enter width size: ");
        int width = input.nextInt();
        System.out.println("Enter height size: ");
        int height = input.nextInt();

        System.out.println(surfaceArea(length, width, height));  // call the surfaceArea method and print the value
    }
}