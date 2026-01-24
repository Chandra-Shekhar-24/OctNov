package JavaProgramming.inputandoutput;

import java.util.Scanner;

public class q006 {

    // Method to cal Max score 
    public static int chessScore(int a, int b) {
        int Max_Score = a * (b - 1) + b * (a - 1);
        return Max_Score;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value of N: ");
        if (!input.hasNextInt()) {
            System.out.println("Please enter a valid input");
            input.close();
            return;
        }
        int n = input.nextInt();
        System.out.println("Enter a value of M: ");
        if (!input.hasNextInt()) {
            System.out.println("Please enter a valid input");
            input.close();
            return;
        }
        int m = input.nextInt();

        int ans = chessScore(n, m);  // call the chessscore method to calculate the value of Maximum Score
        System.out.println(ans);     
    }
}