package JavaProgramming.inputandoutput;
import java.util.Scanner;
public class q001 {

    // Method to calculate the volume of sphere using radius
    public static void volumeOfSphere(double radius){
        double volume = (4.0/3.0)* 3.14 * radius * radius * radius;
        System.out.println("Volume of Radius: " + volume);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        // if the user enter the wrong input
        if(!scanner.hasNextDouble()){
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double radiusOfBall = scanner.nextFloat();
        
        volumeOfSphere(radiusOfBall);
        scanner.close();
    }
}
