package Leetcode;

import java.util.Scanner;

class Q88 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // for size of arr1
        System.out.println("Enter the size of first array");
        int size1 = obj.nextInt();

        System.out.println("Enter the elements of first array");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = obj.nextInt();
        }

        // for size of arr2
        System.out.println("Enter the size of second array");
        int size2 = obj.nextInt();

        System.out.println("Enter the elements of second array");
        int[] arr2 = new int[size2];
        for (int j = 0; j < size2; j++) {
            arr2[j] = obj.nextInt();
        }

        int[] arr3 = new int[size1 + size2];

        // print the element of array 1

        System.out.print("Elements of first array : ");
        printArray(arr1);
        System.out.println();
        System.out.println();
        
        // print the element of array 2
        System.out.print("Elements of second array : ");
        printArray(arr2);
        System.out.println();
        System.out.println();

        // print the all element of array 1 and array 2 after merge
        System.out.print("Sorted array after merge ");
        mergeTwoSortedArray(arr1, arr2, arr3);

        obj.close();
    }

    public static void mergeTwoSortedArray(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        // if the element of arr1 is empty and in arr2 elements are remaining
        if (i == arr1.length) {
            while (j < arr2.length) {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        // if the element of arr2 is empty and in arr1 elements are remaining
        if (j == arr2.length) {
            while (i < arr1.length) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        }
        System.out.println();
        printArray(arr3);
    }

    // Make a printArray method for making a code simpler
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}