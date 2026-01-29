import java.util.Scanner;

public class quespractice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < size; j++) {
            if (arr[j] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
