package Practice.lbp001;

import java.util.Scanner;

public class lbpq001 {

    public static boolean isPrimeDigit(int number) {
        if (number == 2 || number == 3 || number == 5 || number == 7) {
            return true;
        }
        return false;

    }

    public static int calculateSumOfPrimeDigit(int number) {
        int sum = 0;
        int temp = number;
        while (number > 0) {
            int lastdigit = number % 10;
            if (isPrimeDigit(lastdigit)) {
                sum += lastdigit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        if (!scanner.hasNextInt()) {
            System.out.print("Invalid input");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();

        int result = calculateSumOfPrimeDigit(number);
        System.out.println(result);
    }
}
