import java.util.Scanner;

public class returnLastDigitOfTheGivenNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();

        System.out.println("Number");
        int result = findlastdigit(number);
        System.out.println(result);
        System.out.println("Number");
    }

    public static int findlastdigit(int number) {
        return number % 10;
    }
}