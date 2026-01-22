package Leetcode;

import java.util.Scanner;

public class mergesortedarray {
    public static void mergeSortalgorithm(int[] arr){
        int length = arr.length;
        int[] a = new int[length/2];
        int [] b = new int[length - length/2];
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        
        mergeSortalgorithm(arr);
    } 
}
