package programming.algorithm.mergesort;

import java.util.Scanner;

class mergeTwoSortedArray {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void mergetwoSortedArray(int[] arr, int[] brr, int[] ans) {
        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = brr[j++];
            }
        }

        while (i < arr.length) {
            ans[k++] = arr[i++];
        }

        while (j < brr.length) {
            ans[k++] = brr[j++];
        }

    }

    public static void mergeSort(int[] arr) {

        if (arr.length == 1) {
            return;
        }
        int[] fp = new int[arr.length / 2];

        for (int i = 0; i < fp.length; i++) {
            fp[i] = arr[i];
        }
        int[] sp = new int[arr.length - arr.length / 2];

        for (int i = 0; i < sp.length; i++) {
            sp[i] = arr[i + fp.length]; 
        }

        mergeSort(fp);
        mergeSort(sp);
        mergetwoSortedArray(fp, sp, arr);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        mergeSort(arr);
        print(arr);
    }
}