 package JavaProgramming.inputandoutput;
import java.util.Scanner;
public class q004 {

    public static int cupcakePackaging(int number){
        int result = (number+1)/2;
        return result;
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Package size A: ");

        if(!scanner.hasNextInt()){
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        int packageSizeA = scanner.nextInt();
        int leftovers = cupcakePackaging(packageSizeA);

        System.out.println("Maximize leftovers: "+leftovers);
    }
}