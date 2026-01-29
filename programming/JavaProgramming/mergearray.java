package JavaProgramming;
import java.util.Scanner;
public class mergearray {
    public static void mergeSortAlgorithm(int[] arr){
        if(arr.length == 1){
            return;
        }

        int length = arr.length;
        int[] a = new int[length/2];
        int[] b = new int[length - length/2];
        mergeSortAlgorithm(a);
        mergeSortAlgorithm(b);
        mergeSortedArray(a, b);
    }
    public static void mergeSortedArray(int[] arr,int[] brr){
        int[] crr = new int[arr.length+brr.length];
        int i=0,j=0,k=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                crr[k++] = arr[i++];
            }
            else{
                crr[k++] = brr[j++];
            }
        }
        if(i == arr.length){
            while(j<brr.length){
                crr[k++] = brr[j++];
            }
        }
        if(j == brr.length){
            while(i<arr.length){
                crr[k++] = arr[i++];
            }
        }
    }
    public static void printArray(int[] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }


       

        mergeSortAlgorithm(arr);
        printArray(arr);
    }
}
