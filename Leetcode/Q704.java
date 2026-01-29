package leetcode;
import java.util.Scanner;
public class Q704 {

    // Method of find the target element is present or not 
    public static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // if target element not present then return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = obj.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = obj.nextInt();
        System.out.println(binarySearch(arr, 0, size - 1, target));
    }
}
